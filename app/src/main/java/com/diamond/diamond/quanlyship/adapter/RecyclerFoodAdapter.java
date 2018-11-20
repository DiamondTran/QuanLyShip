package com.diamond.diamond.quanlyship.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.diamond.diamond.quanlyship.R;
import com.diamond.diamond.quanlyship.model.Food;

import java.util.List;

public class RecyclerFoodAdapter extends RecyclerView.Adapter<RecyclerFoodAdapter.MyViewHolder> {
private Context context;
private List<Food> foodList;

    public RecyclerFoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater= LayoutInflater.from(context);
        view= inflater.inflate(R.layout.item_cardfoodview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        final Food food= foodList.get(position);
holder.tv_food_name.setText(foodList.get(position).getNamefood());
holder.tv_food_pice.setText(foodList.get(position).getPrice());
holder.img_food.setImageResource(foodList.get(position).getImg());

holder.themcard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        showPopupMenu(holder.themcard, food.getNamefood());
    }
});
    }
    public void showPopupMenu(View view, String type){
        PopupMenu popupMenu= new PopupMenu(context, view);
        MenuInflater inflater= popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_cardview,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new RecyclerFoodAdapter.MyMenuItemClickListener(type));
        popupMenu.show();
    }
    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_food_name;
        TextView tv_food_pice;
        ImageView themcard;
        ImageView img_food;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_food_name= (TextView) itemView.findViewById(R.id.namecard);
            tv_food_pice= (TextView) itemView.findViewById(R.id.giacard);
            themcard= (ImageView) itemView.findViewById(R.id.chamcard);
            img_food=(ImageView) itemView.findViewById(R.id.imgfood);
        }
    }
    private class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {
        private String type;
        public MyMenuItemClickListener(String type) {
            this.type= type;

        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.them:
                    Toast.makeText(context, "Thêm Thành Công", Toast.LENGTH_SHORT).show();
                case R.id.edit:

                case R.id.delete:
                default:
            }
            return false;
        }
    }
}
