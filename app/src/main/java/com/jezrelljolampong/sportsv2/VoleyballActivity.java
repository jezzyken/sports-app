package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jezrelljolampong.sportsv2.Adapter.SportsAdapter;
import com.jezrelljolampong.sportsv2.Adapter.VolleyballAdapter;
import com.jezrelljolampong.sportsv2.Model.Sports;

import java.util.ArrayList;
import java.util.List;

public class VoleyballActivity extends AppCompatActivity {

    RecyclerView listshowrcy;
    List<Sports> _list = new ArrayList<>();
    VolleyballAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voleyball);

        load();
        setTitle("Volleyball");
    }

    public void load(){
        _list.add(new Sports("Common Youth Volleyball Injuries"));
        _list.add(new Sports("Volleyball: Guidelines"));
        _list.add(new Sports("Rules and Registration"));
        _list.add(new Sports("Volleyball"));
        _list.add(new Sports("History"));
        _list.add(new Sports("The court dimensions"));
        _list.add(new Sports("Warm-Up for Volleyball"));
        _list.add(new Sports("Volleyball: Strategy and Team Play"));

        listshowrcy = findViewById(R.id.listshow);
        listshowrcy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listshowrcy.setLayoutManager(linearLayoutManager);
        adapter = new VolleyballAdapter(_list, VoleyballActivity.this);
        listshowrcy.setAdapter(adapter);
    }
}
