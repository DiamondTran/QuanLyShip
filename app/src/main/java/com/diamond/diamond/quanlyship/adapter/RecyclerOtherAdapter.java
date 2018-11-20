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
    public void showPopupMenu(View view, String type){
        PopupMenu popupMenu= new PopupMenu(context, view);
        MenuInflater inflater= popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_cardview,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new RecyclerOtherAdapter.MyMenuItemClickListener(type));
        popupMenu.show();
    }
    @Override
    public void onBindViewHolder(@NonNull final RecyclerOtherAdapter.MyViewHolder holder, int position) {
        final Other other= listother.get(position);

        holder.tv_other_name.setText(listother.get(position).getNameother());
        holder.tv_other_pice.setText(listother.get(position).getPrice());
        holder.img_other.setImageResource(listother.get(position).getImg());
     holder.themcard.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             showPopupMenu(holder.themcard, other.getNameother());
         }
     });

    }

    @Override
    public int getItemCount() {
        return listother.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_other_name;
        TextView tv_other_pice;
        ImageView themcard;
        ImageView img_other;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_other_name= (TextView) itemView.findViewById(R.id.namecard);
            tv_other_pice= (TextView) itemView.findViewById(R.id.giacard);
            themcard=(ImageView) itemView.findViewById(R.id.chamcard);
            img_other=(ImageView) itemView.findViewById(R.id.imgother);
        }
    }

    public class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {
        private String type;

        public MyMenuItemClickListener(String type) {
            this.type = type;
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
