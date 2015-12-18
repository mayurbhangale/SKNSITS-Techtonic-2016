package com.mayurbhangale.sknsitstechtonic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        WebView web;
        web = (WebView) findViewById(R.id.webview2);
        web.getSettings().setJavaScriptEnabled(true);
        web.setLongClickable(false);
        web.loadUrl("file:///android_res/raw/about.html");
    }
}
