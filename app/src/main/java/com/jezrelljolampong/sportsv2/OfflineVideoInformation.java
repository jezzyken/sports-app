package com.jezrelljolampong.sportsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class OfflineVideoInformation extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;

    WebView webview;

    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_video_information);

        key = getIntent().getStringExtra("key");

        setTitle(key);

        if (key.equals("Basketball Overview")){
            videoView = (VideoView) findViewById(R.id.videoView);
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.basketball);
            mediaController = new MediaController(OfflineVideoInformation.this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            webview = findViewById(R.id.web);
            webview.loadUrl("file:///android_asset/Basketball/1.html");
        }else if (key.equals("Badminton Overview")){
            videoView = (VideoView) findViewById(R.id.videoView);
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.badminton);
            mediaController = new MediaController(OfflineVideoInformation.this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            webview = findViewById(R.id.web);
            webview.loadUrl("file:///android_asset/Badminton/1.html");
        }else if (key.equals("Football Overview")){
            videoView = (VideoView) findViewById(R.id.videoView);
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.football);
            mediaController = new MediaController(OfflineVideoInformation.this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            webview = findViewById(R.id.web);
            webview.loadUrl("file:///android_asset/Football/4.html");

        }else if (key.equals("Tennis Overview")){
            videoView = (VideoView) findViewById(R.id.videoView);
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.tennis);
            mediaController = new MediaController(OfflineVideoInformation.this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            webview = findViewById(R.id.web);
            webview.loadUrl("file:///android_asset/Tennis/6.html");

        }else if (key.equals("Volleyball Overview")){
            videoView = (VideoView) findViewById(R.id.videoView);
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.volleyball);
            mediaController = new MediaController(OfflineVideoInformation.this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            webview = findViewById(R.id.web);
            webview.loadUrl("file:///android_asset/Volleyball/4.html");

        }



    }
}
