package com.diamond.diamond.quanlyship.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diamond.diamond.quanlyship.R;
import com.diamond.diamond.quanlyship.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {
List<Food> listf;

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        listf= new ArrayList<>();
        listf.add(new Food(R.drawable.banhran,"Bánh Rán","13.000"));
        listf.add(new Food(R.drawable.cavien,"Cá Viên","5.000"));
        listf.add(new Food(R.drawable.chuoichien,"Chuối Chiên","10.000"));
        listf.add(new Food(R.drawable.khoaitay,"Khoai Tây","15.000"));
        listf.add(new Food(R.drawable.nemdan,"Nem Rán","5.000"));
        listf.add(new Food(R.drawable.ngo,"Ngô Nướng","16.000"));
        listf.add(new Food(R.drawable.thitxien,"Thịt Xiên","7.000"));

//        RecyclerView recyclerView= (RecyclerView) getView().findViewById(R.id.recyclerview);
        // đấy bạn làm thêm gì thì bjn làm đi chứ chạy lên là chết luôn ở màn hình này rồi
        // bạn k sửa đc à
        //biết m định làm cái gì đâu, m bảo sửa findviewbyid thì đk rồi kia
        //chạy lên k được à. định làm như cái lít hiện lên của m ý
        //định làm cả cái dấu 3c chấm đấy luôn

      return inflater.inflate(R.layout.fragment_food, container, false);



    }

}
