package com.example.pocwebviewandroid;

// package mgks.os.fileup;

/*
 * Os-FileUp is an Open Source Android Project hosted on GitHub (https://github.com/mgks/Os-FileUp).
 * Developed by Ghazi Khan (https://github.com/mgks) under MIT Open Source License.
 * This program is free to use for private and commercial purposes.
 * Please donate to the project if it helped you (https://ko-fi.com/getmgks).
 * Don't forget to mention project source or developer credit in your Application's License(s) Wiki.
 * Giving right credit to developers encourages them to create better projects :)
 */

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new WebAppInterface(this), "Android");

        // WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        // webView.setWebViewClient(webViewClient);

        webView.loadUrl("https://poc-webview-web.guilhermedeoliveira.vercel.app/");

    }
}