package com.example.mode1.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mode1.R;
import com.example.mode1.beans.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by 张亚丹 on 2019/5/29.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private ArrayList<User> list;
    private Context context;

    public Adapter(ArrayList<User> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = list.get(position);
        holder.tv_name.setText(user.getName());
        holder.tv_age.setText(user.getAge());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_age;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_age = itemView.findViewById(R.id.tv_age);
        }
    }
}
