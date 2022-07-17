package com.marielly.listafutebol.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.marielly.listafutebol.R;
import com.marielly.listafutebol.adapter.AdapterTimes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent it = getIntent();
        TextView nomeTime, cidade, titulosBox;
        ImageView img;

        nomeTime = findViewById(R.id.nomeTime);
        img = findViewById(R.id.imageViewEscudo);
        titulosBox = findViewById(R.id.titulosBox);
        cidade = findViewById(R.id.cidadeEstado);


        if(it!=null) {
            String nome = it.getStringExtra("nomeTime");
            int imagem = it.getIntExtra("img", -1);
            String cidadeTime = it.getStringExtra("cidade");
            ArrayList<String> titulosTime = it.getStringArrayListExtra("titulos");

            System.out.println(titulosTime.toString());
            String titulos = "";
            for (String titulo : titulosTime){
                titulos = titulos + titulo + "\n";
            }

            nomeTime.setText(nome);
            img.setImageResource(imagem);
            cidade.setText(cidadeTime);
            titulosBox.setText(titulos);
        }
    }

}