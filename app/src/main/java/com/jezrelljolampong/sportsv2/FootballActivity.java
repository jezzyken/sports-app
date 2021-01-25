package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jezrelljolampong.sportsv2.Adapter.FootballAdapter;
import com.jezrelljolampong.sportsv2.Adapter.SportsAdapter;
import com.jezrelljolampong.sportsv2.Model.Sports;

import java.util.ArrayList;
import java.util.List;

public class FootballActivity extends AppCompatActivity {

    RecyclerView listshowrcy;
    List<Sports> _list = new ArrayList<>();
    FootballAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        load();
        setTitle("Football");
    }

    public void load(){
        _list.add(new Sports("4 Essential First Aid Tips for Football"));
        _list.add(new Sports("History"));
        _list.add(new Sports("Defensive Football Strategy"));
        _list.add(new Sports("Football"));
        _list.add(new Sports("General Guidelines for all levels"));
        _list.add(new Sports("Early history"));
        _list.add(new Sports("Offensive Football Strategy"));
        _list.add(new Sports("Rules and Registration"));
        _list.add(new Sports("Rules for U6 Players"));
        _list.add(new Sports("Warm-Up for Football"));

        listshowrcy = findViewById(R.id.listshow);
        listshowrcy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listshowrcy.setLayoutManager(linearLayoutManager);
        adapter = new FootballAdapter(_list, FootballActivity.this);
        listshowrcy.setAdapter(adapter);
    }
}
