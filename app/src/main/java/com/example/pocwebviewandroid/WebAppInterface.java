package com.example.pocwebviewandroid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.MediaStore;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

import static androidx.core.app.ActivityCompat.startActivityForResult;

public class WebAppInterface {
    Context mContext;

    static final int REQUEST_IMAGE_CAPTURE = 1;
    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }


    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}

