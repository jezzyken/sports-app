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

public class FootballInformation extends AppCompatActivity {

    String key;
    WebView webview;
    String category = "Football";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_information);

        key = getIntent().getStringExtra("key");

        setTitle("Football");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    List<Bookmark> book = Bookmark.find(Bookmark.class, "name = ?", key);

                    if (book.size() > 0){

                        new SweetAlertDialog(FootballInformation.this, SweetAlertDialog.ERROR_TYPE)
                                .setTitleText("Failed!")
                                .setContentText("Bookmark Already Exist")
                                .show();
                    }else{
                        Bookmark _save= new Bookmark(key, category.trim());
                        new SweetAlertDialog(FootballInformation.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("Success!")
                                .setContentText("Bookmark Save")
                                .show();
                        _save.save();
                    }
                }catch(Exception ex){
                    Toast.makeText(FootballInformation.this, ex.getMessage() + "", Toast.LENGTH_SHORT).show();
                }
            }

        });

        switch (key){

            case "4 Essential First Aid Tips for Football":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/1.html");
                setTitle(key);
                break;
            case "History":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/2.html");
                setTitle(key);
                break;
            case "Defensive Football Strategy":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/3.html");
                setTitle(key);
                break;
            case "Football":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/4.html");
                setTitle(key);
                break;
            case "General Guidelines for all levels":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/5.html");
                setTitle(key);
                break;
            case "Early history":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/6.html");
                setTitle(key);
                break;
            case "Offensive Football Strategy":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/7.html");
                setTitle(key);
                break;
            case "Rules and Registration":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/8.html");
                setTitle(key);
                break;
            case "Rules for U6 Players":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/9.html");
                setTitle(key);
                break;
            case "Warm-Up for Football":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Football/11.html");
                setTitle(key);
                break;

        }


    }
}
