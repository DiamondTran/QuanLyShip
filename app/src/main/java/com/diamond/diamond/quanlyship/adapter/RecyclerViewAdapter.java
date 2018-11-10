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
import com.diamond.diamond.quanlyship.fragment.FoodFragment;
import com.diamond.diamond.quanlyship.model.Food;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private List<Food> foodList;

    public RecyclerViewAdapter(FoodFragment context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.item_cardview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_food_name.setText(foodList.get(position).getNamefood());
        holder.tv_food_pice.setText(foodList.get(position).getPrice());
        holder.img_food.setImageResource(foodList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_food_name;
        TextView tv_food_pice;
        ImageView img_food;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_food_name = (TextView) itemView.findViewById(R.id.namecard);
            tv_food_pice = (TextView) itemView.findViewById(R.id.giacard);
            img_food = (ImageView) itemView.findViewById(R.id.imgfood);
        }
    }
}
