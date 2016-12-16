package app.rappi.com.rappiapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import Models.Child;

/**
 * Created by draffe on 14/12/2016.
 */
public class AdapterList extends BaseAdapter {

    Context context;
    ArrayList<Child> children;
    public AdapterList(Context contexts, ArrayList<Child> hijos) {

        context=contexts;
        children=hijos;
    }


    public int getCount()
    {

        return children.size();
    }

    @Override
    public Object getItem(int position) {
        return children.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewRow = layoutInflater.inflate(R.layout.items, null,
                true);
        TextView mtextView = (TextView) viewRow.findViewById(R.id.text_view);
        ImageView mimageView = (ImageView) viewRow.findViewById(R.id.image_view);
        Child hijos = children.get(i);

        if(hijos.getData().getSubmitText().length()<100)
        mtextView.setText(hijos.getData().getSubmitText());
        else
            mtextView.setText(hijos.getData().getSubmitText().substring(0,100));

        if(hijos.getData().getSubmitText().length()==0)
        {

            mtextView.setText("Data No Disponible");
        }


            String imgUrl = hijos.getData().getBannerImg();

        if(hijos.getData().getBannerImg()!=null)
            if(hijos.getData().getBannerImg().length()>0)
        Glide.with(context).load(imgUrl)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(mimageView);
        return viewRow;
    }

}
