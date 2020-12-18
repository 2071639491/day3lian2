package com.example.day3lian2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day3lian2.R;
import com.example.day3lian2.bean.MainBean;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<MainBean.StudenlistBean> list;

    public MainAdapter(Context context, ArrayList<MainBean.StudenlistBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.main_item, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder holder1= (ViewHolder) holder;
        holder1.tv1.setText(list.get(position).getName());
        holder1.tv2.setText(list.get(position).getSkill());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv1;
        private final TextView tv2;

        public ViewHolder(View inflate) {
            super(inflate);
            tv1 = inflate.findViewById(R.id.tv1);
            tv2 = inflate.findViewById(R.id.tv2);
        }
    }
}
