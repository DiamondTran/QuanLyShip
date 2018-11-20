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

public void showPopupMenu(View view, String type){
    PopupMenu popupMenu= new PopupMenu(context, view);
    MenuInflater inflater= popupMenu.getMenuInflater();
    inflater.inflate(R.menu.menu_cardview,popupMenu.getMenu());
    popupMenu.setOnMenuItemClickListener(new MyMenuItemClickListener(type));
    popupMenu.show();
}

    @Override
    public void onBindViewHolder(@NonNull final RecyclerDrinkAdapter.MyViewHolder holder, final int position) {
      final Drink drink= drinkList.get(position);

        holder.tv_drink_name.setText(drinkList.get(position).getNamedrink());
        holder.tv_drink_pice.setText(drinkList.get(position).getPrice());
        holder.img_drink.setImageResource(drinkList.get(position).getImg());
        holder.chamcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.chamcard, drink.getNamedrink());
            }
        });

    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView chamcard;
        TextView tv_drink_name;
        TextView tv_drink_pice;
        ImageView img_drink;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_drink_name= (TextView) itemView.findViewById(R.id.namecard);
            tv_drink_pice= (TextView) itemView.findViewById(R.id.giacard);
            img_drink=(ImageView) itemView.findViewById(R.id.imgdrink);
            chamcard=(ImageView) itemView.findViewById(R.id.chamcard);
        }
    }

    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {
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


