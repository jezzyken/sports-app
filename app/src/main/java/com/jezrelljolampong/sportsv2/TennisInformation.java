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

public class TennisInformation extends AppCompatActivity {

    String key;
    WebView webview;
    String category = "Tennis";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis_information);

        key = getIntent().getStringExtra("key");

        setTitle("Tennis");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    List<Bookmark> book = Bookmark.find(Bookmark.class, "name = ?", key);

                    if (book.size() > 0){

                        new SweetAlertDialog(TennisInformation.this, SweetAlertDialog.ERROR_TYPE)
                                .setTitleText("Failed!")
                                .setContentText("Bookmark Already Exist")
                                .show();
                    }else{
                        Bookmark _save= new Bookmark(key, category.trim());
                        new SweetAlertDialog(TennisInformation.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("Success!")
                                .setContentText("Bookmark Save")
                                .show();
                        _save.save();
                    }
                }catch(Exception ex){
                    Toast.makeText(TennisInformation.this, ex.getMessage() + "", Toast.LENGTH_SHORT).show();
                }
            }

        });

        switch (key){

            case "First aid for acute injuries in tennis":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/1.html");
                setTitle(key);
                break;
            case "History":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/2.html");
                setTitle(key);
                break;
            case "Origins of the modern game":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/3.html");
                setTitle(key);
                break;
            case "Service":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/4.html");
                setTitle(key);
                break;
            case "Service or Court":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/5.html");
                setTitle(key);
                break;
            case "Tennis":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/6.html");
                setTitle(key);
                break;
            case "Tennis Gear":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/7.html");
                setTitle(key);
                break;
            case "Tennis Guidelines":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/8.html");
                setTitle(key);
                break;
            case "Tennis Rackets":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/9.html");
                setTitle(key);
                break;
            case "Tennis Rules and Regulations":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/10.html");
                setTitle(key);
                break;
            case "Tennis Strategy":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/11.html");
                setTitle(key);
                break;
            case "Warm-Up for Tennis":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Tennis/12.html");
                setTitle(key);
                break;


        }



    }
}
