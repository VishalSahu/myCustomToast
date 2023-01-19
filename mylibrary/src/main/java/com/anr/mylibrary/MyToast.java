package com.anr.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyToast {
    public void makeNewToast(Context context, String message) {
        Toast.makeText(context, "ToAsT: "+message, Toast.LENGTH_SHORT).show();
    }
}
