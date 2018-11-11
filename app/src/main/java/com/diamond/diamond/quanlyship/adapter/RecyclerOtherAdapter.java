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
import com.diamond.diamond.quanlyship.model.Food;
import com.diamond.diamond.quanlyship.model.Other;

import java.util.List;

public class RecyclerOtherAdapter extends  RecyclerView.Adapter<RecyclerOtherAdapter.MyViewHolder>  {
    private Context context;
    private List<Other> listother;

    public RecyclerOtherAdapter(Context context, List<Other> listother) {
        this.context = context;
        this.listother = listother;
    }

    @NonNull
    @Override
    public RecyclerOtherAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater= LayoutInflater.from(context);
        view= inflater.inflate(R.layout.item_cardotherview,parent,false);
        return new RecyclerOtherAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerOtherAdapter.MyViewHolder holder, int position) {
        holder.tv_other_name.setText(listother.get(position).getNameother());
        holder.tv_other_pice.setText(listother.get(position).getPrice());
        holder.img_other.setImageResource(listother.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return listother.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_other_name;
        TextView tv_other_pice;
        ImageView img_other;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_other_name= (TextView) itemView.findViewById(R.id.namecard);
            tv_other_pice= (TextView) itemView.findViewById(R.id.giacard);
            img_other=(ImageView) itemView.findViewById(R.id.imgother);
        }
    }
}
