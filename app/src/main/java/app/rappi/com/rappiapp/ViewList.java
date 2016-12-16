package app.rappi.com.rappiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import Engine.EngineData;
import Models.Child;

public class ViewList extends AppCompatActivity {

    private  ArrayList<Child> children;
    private String Tag="RapidMain";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        children =    new EngineData().getChildren();

        Log.e(Tag,"numeros de childres"+children.size());
        AdapterList lista = new AdapterList(this,children);
        ListView androidListView = (ListView) findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(lista);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("Onitemclick",""+position);
                Intent myIntent = new Intent(getBaseContext(), ViewActivity.class);
                myIntent.putExtra("index",position);
                startActivity(myIntent);
            }
        });

    }
}
