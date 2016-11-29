package com.example.pupa.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView wvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        wvTest = (WebView) findViewById(R.id.wvTest);


        loadWebSite("http://www.twitter.com");


        Button btnGoogle= (Button) findViewById(R.id.btnGoogle);
        Button btnYahoo= (Button) findViewById(R.id.btnYahoo);


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadWebSite("http://www.google.com");

            }
        });


        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadWebSite("http://www.yahoo.com");
            }
        });
    }

    private void loadWebSite(String url) {
        wvTest.setWebViewClient(new TestBrowser());

        wvTest.getSettings().setLoadsImagesAutomatically(true);
        wvTest.getSettings().setJavaScriptEnabled(true);
        wvTest.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvTest.loadUrl(url);
    }


    class TestBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
