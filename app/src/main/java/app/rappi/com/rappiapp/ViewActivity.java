package app.rappi.com.rappiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import Engine.EngineData;
import Models.Data;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent myIntent = getIntent();
        int posicion = myIntent.getIntExtra("index",0);
        Data datos= new EngineData().getChildren().get(posicion).getData();
        ImageView im =(ImageView)findViewById(R.id.Imagenmain);
        if(datos.getBannerImg()!=null)
            if(datos.getBannerImg().length()>0)

                Glide.with(getBaseContext()).load(datos.getBannerImg())
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(im);

        TextView tx = (TextView)findViewById(R.id.Nombre);
        tx.setText(datos.getName());

        TextView des = (TextView)findViewById(R.id.Descripcion);
        if(datos.getDescription().length()>0)
        tx.setText(datos.getDescription());
        else
            tx.setText("Dato No disponible");




    }
}
