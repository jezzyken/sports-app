package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jezrelljolampong.sportsv2.Adapter.SportsAdapter;
import com.jezrelljolampong.sportsv2.Adapter.TennisAdapter;
import com.jezrelljolampong.sportsv2.Model.Sports;

import java.util.ArrayList;
import java.util.List;

public class TennisActivity extends AppCompatActivity {

    RecyclerView listshowrcy;
    List<Sports> _list = new ArrayList<>();
    TennisAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);

        load();
        setTitle("Tennis");
    }

    public void load(){
        _list.add(new Sports("First aid for acute injuries in tennis"));
        _list.add(new Sports("History"));
        _list.add(new Sports("Origins of the modern game"));
        _list.add(new Sports("Service"));
        _list.add(new Sports("Service or Court"));
        _list.add(new Sports("Tennis"));
        _list.add(new Sports("Tennis Gear"));
        _list.add(new Sports("Tennis Guidelines"));
        _list.add(new Sports("Tennis Rackets"));
        _list.add(new Sports("Tennis Rules and Regulations"));
        _list.add(new Sports("Tennis Strategy"));
        _list.add(new Sports("Warm-Up for Tennis"));



        listshowrcy = findViewById(R.id.listshow);
        listshowrcy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listshowrcy.setLayoutManager(linearLayoutManager);
        adapter = new TennisAdapter(_list, TennisActivity.this);
        listshowrcy.setAdapter(adapter);
    }
}
