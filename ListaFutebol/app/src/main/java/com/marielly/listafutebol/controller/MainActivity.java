package com.marielly.listafutebol.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.heroes.RecyclerItemClickListener;
import com.marielly.listafutebol.R;
import com.marielly.listafutebol.adapter.AdapterTimes;
import com.marielly.listafutebol.models.Time;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTimes;
    private List<Time> listTimes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTimes = findViewById(R.id.recyclerViewTimes);
        this.createTime();
        AdapterTimes adapter = new AdapterTimes(listTimes);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerViewTimes.setLayoutManager(layoutManager);
        recyclerViewTimes.setHasFixedSize(true);
        recyclerViewTimes.setAdapter(adapter);

        recyclerViewTimes.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(), recyclerViewTimes,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Time obj = listTimes.get(position);
                                Intent it = new Intent(recyclerViewTimes.getContext(), DetailActivity.class);
                                //recyclerViewTimes.getContext();
                                it.putExtra("nomeTime", listTimes.get(position).getName());
                                it.putExtra("cidade", listTimes.get(position).getCity());
                                it.putExtra("img", listTimes.get(position).getImg());
                                it.putExtra("titulos", listTimes.get(position).getTitulos());
                                System.out.println("***************************");

                                System.out.println(listTimes.get(position).getTitulos().toString());

                                startActivity(it);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }

    private void createTime() {
        ArrayList<String> titulosTimes = new ArrayList<>();
        titulosTimes.add("11 Cariocas");
        titulosTimes.add("3 Brasileiros");
        titulosTimes.add("2 Copas do Brasil");
        titulosTimes.add("3 Supercopas");
        titulosTimes.add("1 Libertadores");
        Time obj = new Time(R.drawable.flamengo, "Flamengo", "Rio de Janeiro/RJ", titulosTimes);
        listTimes.add(obj);
        titulosTimes = new ArrayList<>();

        titulosTimes.add("39 Campeonatos Paranaenses");
        titulosTimes.add("1 Brasileiros");
        titulosTimes.add("0 Copas do Brasil");
        titulosTimes.add("0 Supercopas");
        titulosTimes.add("0 Libertadores");
        obj = new Time(R.drawable.coxa, "Coritiba", "Curitiba/PR", titulosTimes);
        listTimes.add(obj);
        titulosTimes = new ArrayList<>();

        titulosTimes.add("38 Campeonatos Mineiros");
        titulosTimes.add("4 Brasileiros");
        titulosTimes.add("6 Copas do Brasil");
        titulosTimes.add("2 Supercopas");
        titulosTimes.add("2 Libertadores");
        obj = new Time(R.drawable.cruzeiro, "Cruzeiro", "Belo Horizonte/MG", titulosTimes);
        listTimes.add(obj);
        titulosTimes = new ArrayList<>();

        titulosTimes.add("41 Campeonatos Gaúchos");
        titulosTimes.add("2 Brasileiros");
        titulosTimes.add("5 Copas do Brasil");
        titulosTimes.add("0 Supercopas");
        titulosTimes.add("3 Libertadores");
        obj = new Time(R.drawable.gremio, "Grêmio", "Porto Alegre/RS", titulosTimes);
        listTimes.add(obj);
        titulosTimes = new ArrayList<>();
    }
}