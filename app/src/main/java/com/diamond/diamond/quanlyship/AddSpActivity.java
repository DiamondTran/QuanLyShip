package com.diamond.diamond.quanlyship;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.diamond.diamond.quanlyship.model.Food;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class AddSpActivity extends AppCompatActivity {
private ImageView imagefodler;
private ImageView imgsp;
private Button btnaddfood;
private Button btnadddrink;
private Button btnaddother;
int REQUEST_CODE_FODLER=123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sp);
        imagefodler= findViewById(R.id.imgfodler);
        imgsp= findViewById(R.id.adimgsp);
btnaddfood= findViewById(R.id.addfood);
btnadddrink=findViewById(R.id.adddrink);
btnaddother= findViewById(R.id.addother);
        imagefodler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,REQUEST_CODE_FODLER);
            }
        });
        btnaddfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_CODE_FODLER && resultCode == RESULT_OK && data !=null){
            Uri uri= data.getData();
            try {
                InputStream inputStream= getContentResolver().openInputStream(uri);
                Bitmap bitmap= BitmapFactory.decodeStream(inputStream);
                imgsp.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void backhome(View view) {
        startActivity(new Intent(AddSpActivity.this, HomeActivity.class));
    }
}
