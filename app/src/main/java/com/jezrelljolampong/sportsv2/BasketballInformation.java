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

public class BasketballInformation extends AppCompatActivity {

    String key;
    WebView webview;
    String category = "Basketball";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_information);

        key = getIntent().getStringExtra("key");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    List<Bookmark> book = Bookmark.find(Bookmark.class, "name = ?", key);

                    if (book.size() > 0){

                        new SweetAlertDialog(BasketballInformation.this, SweetAlertDialog.ERROR_TYPE)
                                .setTitleText("Failed!")
                                .setContentText("Bookmark Already Exist")
                                .show();
                    }else{
                        Bookmark _save= new Bookmark(key, category.trim());
                        new SweetAlertDialog(BasketballInformation.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("Success!")
                                .setContentText("Bookmark Save")
                                .show();
                        _save.save();
                    }
                }catch(Exception ex){
                    Toast.makeText(BasketballInformation.this, ex.getMessage() + "", Toast.LENGTH_SHORT).show();
                }
            }

        });


        switch (key){

            case "Basketball":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/1.html");
                setTitle(key);
                break;
            case "Basketball Defensive Strategy":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/2.html");
                setTitle(key);
                break;
            case "Duration":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/3.html");
                setTitle(key);
                break;
            case "Fouls":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/4.html");
                setTitle(key);
                break;
            case "Moving the ball":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/5.html");
                setTitle(key);
                break;
            case "Offensive Basketball Strategy":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/6.html");
                setTitle(key);
                break;
            case "Rules and Registration":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/7.html");
                setTitle(key);
                break;
            case "Scoring":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/8.html");
                setTitle(key);
                break;
            case "Shot Clock":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/9.html");
                setTitle(key);
                break;
            case "Strategy":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/10.html");
                setTitle(key);
                break;
            case "Teams/number of players":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/11.html");
                setTitle(key);
                break;
            case "The 10 Top Basketball Injuries":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/12.html");
                setTitle(key);
                break;
            case "The objective":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/13.html");
                setTitle(key);
                break;
            case "Treatment and Cures":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/14.html");
                setTitle(key);
                break;
            case "Warm-Up for Basketball":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Basketball/15.html");
                setTitle(key);
                break;
        }

    }
}
