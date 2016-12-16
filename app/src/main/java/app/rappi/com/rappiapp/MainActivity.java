package app.rappi.com.rappiapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import Engine.Client;
import Engine.EngineData;
import Engine.PersistenData;
import Engine.UtilityEngine;
import Interface.EndPoint;
import Models.Child;
import Models.Data;
import Models.Root;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private String Tag="RapidMain";
    ArrayList<Child> children = new ArrayList<Child>();
    Realm myRealm;
    PersistenData Pers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context con = getApplicationContext();
        Realm.init(getApplication());
         myRealm  = Realm.getDefaultInstance();

        Pers = new PersistenData(myRealm);
        VerificarConexion();
    }

    private void VerificarConexion() {

        boolean conexion  = new UtilityEngine().verificaConexion(getApplicationContext());
        if(conexion)
        {
            EndPoint apiService = Client.getClient().create(EndPoint.class);
            Call<Root> llamada = apiService.getRappidJson();
            llamada.enqueue(new Callback<Root>() {
                @Override
                public void onResponse(Call<Root> call, Response<Root> response) {
                    Root respuesta = response.body();
                    Log.d(Tag, "Numero de data Recibida : " + respuesta.getData().getChildren().size());



                    for(int i=0;i<respuesta.getData().getChildren().size();i++)
                   {

                     Data datos =  respuesta.getData().getChildren().get(i).getData();

                      Pers.InsertData(datos);


                           children.add(respuesta.getData().getChildren().get(i));



                   }


                    Log.d(Tag, "Datos Guardados : " +  Pers.NumerData());

                   ;

                    new DowloadImage(children).execute(null,null,null);

                  /*  new EngineData().setChildren(respuesta.getData().getChildren());

                    Intent myIntent = new Intent(getBaseContext(), ViewList.class);
                    startActivity(myIntent);*/
                }

                @Override
                public void onFailure(Call<Root> call, Throwable t) {
                        NoInternetOpciones();
                }
            });

        }else
        {
          NoInternetOpciones();
        }

    }

    private void NoInternetOpciones() {
        if( Pers.NumerData()==0)
        {

            Intent myIntent = new Intent(getBaseContext(), NoInternet.class);
            startActivity(myIntent);

        }else
        {
            for(int i =0;i<Pers.NumerData();i++)
            {
                Child Hijo = new Child();
                Hijo.setData(Pers.get(i));
                children.add(Hijo);
            }


            new EngineData().setChildren(this.children);

            Intent myIntent = new Intent(getBaseContext(), ViewList.class);
            startActivity(myIntent);

        }

    }


    private class DowloadImage extends  AsyncTask<String , String, String>{
        ArrayList<Child> children;

        public DowloadImage(ArrayList<Child> hijos)
{
    children = hijos;

}


        @Override
        protected String doInBackground(String... params) {

             for(int i =0;i<this.children.size();i++)
             {
                  Log.d(Tag, "Url Imagenes : " + children.get(i).getData().getBannerImg());
                 if(children.get(i).getData().getBannerImg()!=null)
                 if(children.get(i).getData().getBannerImg().length()>0)
                  Glide.with(getApplicationContext()).load(children.get(i).getData().getBannerImg())

                         .crossFade()
                         .diskCacheStrategy(DiskCacheStrategy.ALL);





             }

            return null;
        }

        @Override
        protected void onPostExecute(String Resultado)
        {



            new EngineData().setChildren(this.children);

            Intent myIntent = new Intent(getBaseContext(), ViewList.class);
            startActivity(myIntent);
        }
    }
}


