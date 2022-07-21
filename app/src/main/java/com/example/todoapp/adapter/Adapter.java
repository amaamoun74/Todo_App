package com.example.todoapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todoapp.R;
import com.example.todoapp.database.ItemModel;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.itemViewHolder> {
    private ArrayList<ItemModel> arrayList = new ArrayList<>();


    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void setList(ArrayList<ItemModel> arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }

    public class itemViewHolder extends RecyclerView.ViewHolder {
        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
