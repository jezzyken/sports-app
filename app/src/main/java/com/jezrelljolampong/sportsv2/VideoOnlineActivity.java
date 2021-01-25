package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jezrelljolampong.sportsv2.Adapter.OnlineVideoAdapter;
import com.jezrelljolampong.sportsv2.Model.Offline;

import java.util.Vector;

public class VideoOnlineActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Vector<Offline> offlinevideo = new Vector<Offline>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_online);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        offlinevideo.add(new Offline("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bMu518LyS1Q\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        offlinevideo.add(new Offline("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1UIhKZCPMYM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        offlinevideo.add(new Offline("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9sBL1WsREyE\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        offlinevideo.add(new Offline("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ROL7JDRbPc0\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        offlinevideo.add(new Offline("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zvtn1uxTe1w\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));

        OnlineVideoAdapter adapter = new OnlineVideoAdapter(offlinevideo);
        recyclerView.setAdapter(adapter);
    }
}
