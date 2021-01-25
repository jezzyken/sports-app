package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jezrelljolampong.sportsv2.Adapter.BasketballAdapter;
import com.jezrelljolampong.sportsv2.Adapter.SportsAdapter;
import com.jezrelljolampong.sportsv2.Model.Sports;

import java.util.ArrayList;
import java.util.List;

public class BasketballActivity extends AppCompatActivity {


    RecyclerView listshowrcy;
    List<Sports> _list = new ArrayList<>();
    BasketballAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        load();
        setTitle("Basketball");
    }

    public void load(){
        _list.add(new Sports("Basketball"));
        _list.add(new Sports("Basketball Defensive Strategy"));
        _list.add(new Sports("Duration"));
        _list.add(new Sports("Fouls"));
        _list.add(new Sports("Moving the ball"));
        _list.add(new Sports("Offensive Basketball Strategy"));
        _list.add(new Sports("Rules and Registration"));
        _list.add(new Sports("Scoring"));
        _list.add(new Sports("Shot Clock"));
        _list.add(new Sports("Strategy"));
        _list.add(new Sports("Teams/number of players"));
        _list.add(new Sports("The 10 Top Basketball Injuries"));
        _list.add(new Sports("The objective"));
        _list.add(new Sports("Treatment and Cures"));
        _list.add(new Sports("Warm-Up for Basketball"));


        listshowrcy = findViewById(R.id.listshow);
        listshowrcy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listshowrcy.setLayoutManager(linearLayoutManager);
        adapter = new BasketballAdapter(_list, BasketballActivity.this);
        listshowrcy.setAdapter(adapter);
    }
}
