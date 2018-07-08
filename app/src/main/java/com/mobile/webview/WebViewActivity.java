package com.mobile.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    //widget
    WebView wvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        wvMain = (WebView) findViewById(R.id.wvMain);
        wvMain.loadUrl("file:///android_asset/Registration.html");
        wvMain.getSettings().setJavaScriptEnabled(true);
        wvMain.setWebViewClient(new WebViewClient()
        {
            @Override

            public boolean shouldOverrideUrlLoading (WebView view, String url)
            {
                return false;
            }
        });
        wvMain.setWebChromeClient(new WebChromeClient());
    }
}
