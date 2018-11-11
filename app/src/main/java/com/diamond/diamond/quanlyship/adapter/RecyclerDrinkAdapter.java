package com.diamond.diamond.quanlyship.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.diamond.diamond.quanlyship.R;
import com.diamond.diamond.quanlyship.model.Drink;

import java.util.List;

public class RecyclerDrinkAdapter extends RecyclerView.Adapter<RecyclerDrinkAdapter.MyViewHolder>  {
    private Context context;
    private List<Drink> drinkList;

    public RecyclerDrinkAdapter(Context context, List<Drink> drinkList) {
        this.context = context;
        this.drinkList = drinkList;
    }


    @NonNull
    @Override
    public RecyclerDrinkAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater= LayoutInflater.from(context);
        view= inflater.inflate(R.layout.item_carddrinkview,parent,false);
        return new RecyclerDrinkAdapter.MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerDrinkAdapter.MyViewHolder holder, int position) {
        holder.tv_drink_name.setText(drinkList.get(position).getNamedrink());
        holder.tv_drink_pice.setText(drinkList.get(position).getPrice());
        holder.img_drink.setImageResource(drinkList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_drink_name;
        TextView tv_drink_pice;
        ImageView img_drink;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_drink_name= (TextView) itemView.findViewById(R.id.namecard);
            tv_drink_pice= (TextView) itemView.findViewById(R.id.giacard);
            img_drink=(ImageView) itemView.findViewById(R.id.imgdrink);
        }
    }
}


