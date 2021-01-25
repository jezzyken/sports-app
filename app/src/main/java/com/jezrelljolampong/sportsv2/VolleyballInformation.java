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

public class VolleyballInformation extends AppCompatActivity {

    String key;
    WebView webview;
    String category = "Voleyball";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball_information);

        key = getIntent().getStringExtra("key");

        setTitle("Volleyball");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    List<Bookmark> book = Bookmark.find(Bookmark.class, "name = ?", key);

                    if (book.size() > 0){

                        new SweetAlertDialog(VolleyballInformation.this, SweetAlertDialog.ERROR_TYPE)
                                .setTitleText("Failed!")
                                .setContentText("Bookmark Already Exist")
                                .show();
                    }else{
                        Bookmark _save= new Bookmark(key, category.trim());
                        new SweetAlertDialog(VolleyballInformation.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("Success!")
                                .setContentText("Bookmark Save")
                                .show();
                        _save.save();
                    }
                }catch(Exception ex){
                    Toast.makeText(VolleyballInformation.this, ex.getMessage() + "", Toast.LENGTH_SHORT).show();
                }
            }

        });

        switch (key){

            case "Common Youth Volleyball Injuries":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/1.html");
                setTitle(key);
                break;
            case "Volleyball: Guidelines":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/2.html");
                setTitle(key);
                break;
            case "Rules and Registration":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/3.html");
                setTitle(key);
                break;
            case "Volleyball":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/4.html");
                setTitle(key);
                break;
            case "History":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/5.html");
                setTitle(key);
                break;
            case "The court dimensions":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/6.html");
                setTitle(key);
                break;
            case "Warm-Up for Volleyball":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/7.html");
                setTitle(key);
                break;
            case "Volleyball: Strategy and Team Play":
                webview = findViewById(R.id.web);
                webview.loadUrl("file:///android_asset/Volleyball/8.html");
                setTitle(key);
                break;
        }
    }
}
