package com.diamond.diamond.quanlyship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    }

    public void backhome(View view) {
        Intent intent= new Intent(ListActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
