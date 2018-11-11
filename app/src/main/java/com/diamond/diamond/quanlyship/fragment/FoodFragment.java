package com.diamond.diamond.quanlyship.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diamond.diamond.quanlyship.R;
import com.diamond.diamond.quanlyship.adapter.RecyclerFoodAdapter;
import com.diamond.diamond.quanlyship.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {
List<Food> listf;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        listf= new ArrayList<>();
        listf.add(new Food(R.drawable.banhran,"Bánh Rán","13.000"));
        listf.add(new Food(R.drawable.cavien,"Cá Viên","5.000"));
        listf.add(new Food(R.drawable.chuoichien,"Chuối Chiên","10.000"));
        listf.add(new Food(R.drawable.khoaitay,"Khoai Tây","15.000"));
        listf.add(new Food(R.drawable.nemdan,"Nem Rán","5.000"));
        listf.add(new Food(R.drawable.ngo,"Ngô Nướng","16.000"));
        listf.add(new Food(R.drawable.thitxien,"Thịt Xiên","7.000"));

        RecyclerView recyclerView= (RecyclerView) getView().findViewById(R.id.recyclerview);
        RecyclerFoodAdapter  myFoodaAapter= new RecyclerFoodAdapter(getContext(),listf);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setAdapter(myFoodaAapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
            // Inflate the layout for this fragment


            return inflater.inflate(R.layout.fragment_food, container, false);



    }

}
