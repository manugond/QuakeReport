package com.example.android.quakereport;


import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private static final String TAG = "EarthQuakeLoader";
    String urls;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        urls = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.v(TAG, "StartedLoading..................1");
    }

    @Override
    public List<Earthquake> loadInBackground() {
        Log.v(TAG, "StartedLoading..................1");
        if (urls == null) {
            return null;
        } else {
            List<Earthquake> result = QueryUtils.fetchEarthquakeData(urls);
            return result;
        }
    }
}
