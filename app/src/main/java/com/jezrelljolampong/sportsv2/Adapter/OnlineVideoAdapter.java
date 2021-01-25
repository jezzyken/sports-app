package com.jezrelljolampong.sportsv2.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.jezrelljolampong.sportsv2.Model.Offline;
import com.jezrelljolampong.sportsv2.R;

import java.util.List;

public class OnlineVideoAdapter extends RecyclerView.Adapter<OnlineVideoAdapter.VideoViewHolder> {

    List<Offline> sampleVideo;
    public OnlineVideoAdapter(){

    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( viewGroup.getContext()).inflate(R.layout.online_video, viewGroup, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder videoViewHolder, int i) {
        videoViewHolder.videoweb.loadData(sampleVideo.get(i).getVideourl(), "text/html", "utf-8");
    }

    public OnlineVideoAdapter(List<Offline> sampleVideo) {
        this.sampleVideo = sampleVideo;
    }



    @Override
    public int getItemCount() {
        return sampleVideo.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView videoweb;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);

            videoweb = itemView.findViewById(R.id.WebVideoView);
            videoweb.setWebChromeClient(new WebChromeClient());
            videoweb.getSettings().setJavaScriptEnabled(true);
            videoweb.getSettings().setPluginState(WebSettings.PluginState.ON);

        }
    }



}
