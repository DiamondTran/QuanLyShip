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
import com.diamond.diamond.quanlyship.adapter.RecyclerOtherAdapter;
import com.diamond.diamond.quanlyship.model.Food;
import com.diamond.diamond.quanlyship.model.Other;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends Fragment {
List<Other> listother;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        listother= new ArrayList<>();
        listother.add(new Other(R.drawable.gakho,"Gà Khô","20.000"));
        listother.add(new Other(R.drawable.bokho,"Bò Khô","25.000"));
        listother.add(new Other(R.drawable.heochaytoi,"Heo Cháy Tỏi","23.000"));
        listother.add(new Other(R.drawable.muckho,"Mực Khô","35.000"));


        RecyclerView recyclerView= (RecyclerView) getView().findViewById(R.id.recyclerview);
        RecyclerOtherAdapter myOtheraAapter= new RecyclerOtherAdapter(getContext(),listother);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setAdapter(myOtheraAapter);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false);
    }

}
