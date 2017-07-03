package com.zadi.volley;

/**
 * Created by Muh. Zadi on 6/9/2017.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ImageSwitcher;
public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    Context context;
    ImageSwitcher imageSwitcher;
    ImageView imgViewOne;
    private TextView txtIndo, txtArab;
    ArrayList<HashMap<String, String >> list_data;
    public AdapterList(RecycleView mainActivity, ArrayList<HashMap<String, String >>list_data, ImageView imgs, TextView txtindo,TextView txtarab ){
        this.context = mainActivity;
        this.list_data = list_data;
        this.imgViewOne=imgs;
        this.txtArab=txtarab;
        this.txtIndo=txtindo;
    }

    @Override
    public AdapterList.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_images, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterList.ViewHolder holder, final int position) {
       /* Picasso.with(context.getApplicationContext())
                .load("http://200.200.200.197/app_blogvolley/img/" + list_data.get(position).get("gambar"))
                .error(R.drawable.no_available)
                .into(holder.imghape);*/
        Glide.with(context)
                .load("http://192.168.43.228/app_blogvolley/img/" + list_data.get(position).get("gambar"))
                .crossFade()
                .placeholder(R.drawable.no_available)
                .into(holder.imghape);
        // holder.txthape.setText(list_data.get(position).get("merk"));
        holder.imghape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(context)
                        .load("http://192.168.43.228/app_blogvolley/img/" + list_data.get(position).get("gambar"))
                        .crossFade()
                        .placeholder(R.drawable.no_available)
                        .into(imgViewOne);
                txtArab.setText((CharSequence) list_data.get(position).get("tipe"));
                txtIndo.setText(list_data.get(position).get("merk"));
            }
        });
        HashMap<String, String> data = list_data.get(position);
    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imghape;
        public ViewHolder(final View itemView) {
            super(itemView);
            imghape = (ImageView) itemView.findViewById(R.id.imghp);
            imghape.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    /*/ Kalo dibawah ini error, atur sendiri ya. Yg penting ImageSwitcher sudah didapatkan
                    Glide.with(context)
                            .load("http://192.168.43.228/app_blogvolley/img/" + list_data.get(getAdapterPosition()).get("gambar"))
                            .crossFade()
                            .placeholder(R.drawable.no_available)
                            .into((ImageView)imageSwitcher.getCurrentView());*/
                    Toast.makeText(context, "satu" +list_data.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }
}