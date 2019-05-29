package com.example.mode1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mode1.adapters.Adapter;
import com.example.mode1.beans.User;
import com.example.mode1.utils.Dbutils;

import java.util.ArrayList;
import java.util.List;

//张亚丹  1810A
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecy;
    private ArrayList<User> list;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initQurry();
    }

    private void initQurry() {
        List<User> users = Dbutils.querryAll();
        list.addAll(users);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            Dbutils.insert(new User(null,"毛毛"+i,""+i));
            adapter.notifyDataSetChanged();
        }
    }

    private void initView() {
        mRecy = (RecyclerView) findViewById(R.id.Recy);

        mRecy.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new Adapter(list, this);
        mRecy.setAdapter(adapter);
    }
}
