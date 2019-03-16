package com.example.olmedo.galeria;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Random;

final class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);



        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        int imagenes[] = {R.drawable.img01, R.drawable.img02, R.drawable.img03, R.drawable.img04, R.drawable.img05, R.drawable.img06, R.drawable.img07, R.drawable.img08, R.drawable.img09};
        int posicionArrayNuevaImagen  = new Random().nextInt(imagenes.length);
        int idCelda = v.getId();
        ImageView celda = findViewById(idCelda);
        celda.setImageResource(imagenes[posicionArrayNuevaImagen]);
    }
}
