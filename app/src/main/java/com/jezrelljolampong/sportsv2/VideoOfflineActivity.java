package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.jezrelljolampong.sportsv2.Adapter.OfflineVideoAdapter;
import com.jezrelljolampong.sportsv2.Model.Menus;

import java.util.ArrayList;
import java.util.List;

public class VideoOfflineActivity extends AppCompatActivity {

    RecyclerView listshowrcy;
    List<Menus> menulist = new ArrayList<>();
    OfflineVideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_offline);

        setTitle("Offline Video");
        Menu();

    }

    public void Menu(){
        menulist.add(new Menus("Badminton Overview",
                R.drawable.badminton));
        menulist.add(new Menus("Basketball Overview",
                R.drawable.basketball));
        menulist.add(new Menus("Football Overview",
                R.drawable.football));
        menulist.add(new Menus("Tennis Overview",
                R.drawable.tennis));
        menulist.add(new Menus("Volleyball Overview",
                R.drawable.volleyball));

        listshowrcy = findViewById(R.id.listshow);
        StaggeredGridLayoutManager gridLayoutManager =
                new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        gridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        listshowrcy.setLayoutManager(gridLayoutManager);

        adapter = new OfflineVideoAdapter(menulist, VideoOfflineActivity.this);
        listshowrcy.setAdapter(adapter);
    }
}
