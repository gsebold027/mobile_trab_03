package com.marielly.listafutebol.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marielly.listafutebol.R;
import com.marielly.listafutebol.models.Time;

import java.util.List;

public class AdapterTimes extends RecyclerView.Adapter<AdapterTimes.MyViewHolder> {

    private List<Time> listTimes;

    public AdapterTimes(List<Time> listHeroes) {
        this.listTimes = listHeroes;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, city;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.textViewName);
            city = view.findViewById(R.id.textViewCity);
            img = view.findViewById(R.id.imageViewTime);
        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_times, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Time obj = listTimes.get(position);

        holder.name.setText(obj.getName());
        holder.city.setText(obj.getCity());
        holder.img.setImageResource(obj.getImg());

    }

    @Override
    public int getItemCount() {
        return listTimes.size();
    }
}