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
import com.diamond.diamond.quanlyship.adapter.RecyclerDrinkAdapter;
import com.diamond.diamond.quanlyship.adapter.RecyclerFoodAdapter;
import com.diamond.diamond.quanlyship.model.Drink;
import com.diamond.diamond.quanlyship.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrinkFragment extends Fragment {


    List<Drink> listDrink;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        listDrink= new ArrayList<>();
        listDrink.add(new Drink(R.drawable.cafe,"Cafe Nâu","20.000"));
        listDrink.add(new Drink(R.drawable.cafeden,"Cafe Đen","20.000"));
        listDrink.add(new Drink(R.drawable.sinhtodau,"Sinh Tố Dâu","35.000"));
        listDrink.add(new Drink(R.drawable.sinhtoxoai,"Sinh Tố Xoài","33.000"));
        listDrink.add(new Drink(R.drawable.trasua,"Trà Sữa","30.000"));
        listDrink.add(new Drink(R.drawable.nuocngot,"Nước Ngọt","10.000"));


        RecyclerView recyclerView= (RecyclerView) getView().findViewById(R.id.recyclerview);
        RecyclerDrinkAdapter myFoodaAapter= new RecyclerDrinkAdapter(getContext(),listDrink);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setAdapter(myFoodaAapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drink, container, false);
    }

}
