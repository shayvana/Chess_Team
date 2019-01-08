package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;



public class WebViewActivity extends Activity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.ihsa.org/SportsActivities/Chess/RecordsHistory.aspx?url=/data/ct/records/index.htm");

    }

}