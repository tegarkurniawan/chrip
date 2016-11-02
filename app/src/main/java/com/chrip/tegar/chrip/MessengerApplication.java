package com.chrip.tegar.chrip;

/**
 * Created by tegar on 01/11/16.
 */

import android.app.Application;

import java.util.ArrayList;

public class MessengerApplication extends Application {
    private ArrayList<ChirpMessage> arrayList = new ArrayList<ChirpMessage>();
    public MessageArrayAdapter adapter;

    @Override
    public void onCreate() {
        super.onCreate();
        adapter = new MessageArrayAdapter(this, android.R.layout.list_content, arrayList);
    }
}
