package com.jezrelljolampong.sportsv2;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.jezrelljolampong.sportsv2.Model.Bookmark;

import java.util.List;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class BadmintonInformation extends AppCompatActivity {

    String key;
    WebView webview;
    String category = "Badminton";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton_information);

        key = getIntent().getStringExtra("key");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    List<Bookmark> book = Bookmark.find(Bookmark.class, "name = ?", key);

                    if (book.size() > 0){

                        new SweetAlertDialog(BadmintonInformation.this, SweetAlertDialog.ERROR_TYPE)
                                .setTitleText("Failed!")
                                .setContentText("Bookmark Already Exist")
                                .show();
                    }else{
                        Bookmark _save= new Bookmark(key, category.trim());
                        new SweetAlertDialog(BadmintonInformation.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("Success!")
                                .setContentText("Bookmark Save")
                                .show();
                        _save.save();
                    }
                }catch(Exception ex){
                    Toast.makeText(BadmintonInformation.this, ex.getMessage() + "", Toast.LENGTH_SHORT).show();
                }
            }

        });

        switch (key){

            case "Badminton":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/1.html");
                setTitle(key);
                break;
            case "Badminton Guidelines":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/2.html");
                setTitle(key);
                break;
            case "Badminton Rules":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/3.html");
                setTitle(key);
                break;
            case "Badminton Basic principles":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/4.html");
                setTitle(key);
                break;
            case "Doubles Badminton Strategies":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/5.html");
                setTitle(key);
                break;
            case "Equipment":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/6.html");
                setTitle(key);
                break;
            case "First aid for acute injuries in badminton":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/7.html");
                setTitle(key);
                break;
            case "History":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/8.html");
                setTitle(key);
                break;
            case "Badminton Scoring":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/9.html");
                setTitle(key);
                break;
            case "Single badminton Strategies":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/10.html");
                setTitle(key);
                break;
            case "Badminton Strategies":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/11.html");
                setTitle(key);
                break;
            case "Warmup for Badminton":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Badminton/12.html");
                setTitle(key);
                break;
        }


    }
}
