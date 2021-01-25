package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jezrelljolampong.sportsv2.Adapter.BadmintonAdapter;
import com.jezrelljolampong.sportsv2.Adapter.SportsAdapter;
import com.jezrelljolampong.sportsv2.Model.Sports;

import java.util.ArrayList;
import java.util.List;

public class BadmintonActivity extends AppCompatActivity {

    RecyclerView listshowrcy;
    List<Sports> _list = new ArrayList<>();
    BadmintonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);

        load();
        setTitle("Badminton");
    }

    public void load(){
        _list.add(new Sports("Badminton"));
        _list.add(new Sports("Badminton Guidelines"));
        _list.add(new Sports("Badminton Rules"));
        _list.add(new Sports("Badminton Basic principles"));
        _list.add(new Sports("Doubles Badminton Strategies"));
        _list.add(new Sports("Equipment"));
        _list.add(new Sports("First aid for acute injuries in badminton"));
        _list.add(new Sports("History"));
        _list.add(new Sports("Badminton Scoring"));
        _list.add(new Sports("Single badminton Strategies"));
        _list.add(new Sports("Badminton Strategies"));
        _list.add(new Sports("Warmup for Badminton"));


        listshowrcy = findViewById(R.id.listshow);
        listshowrcy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listshowrcy.setLayoutManager(linearLayoutManager);
        adapter = new BadmintonAdapter(_list, BadmintonActivity.this);
        listshowrcy.setAdapter(adapter);
    }
}
