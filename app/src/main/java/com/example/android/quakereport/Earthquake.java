package com.example.android.quakereport;

/**
 * Created by manug on 3/26/2018.
 */

public class Earthquake {
    double magnitude;
    long date;
    String place;
    String url;

    public Earthquake(double m, String p, long d, String u) {
        magnitude=m;
        date=d;
        place=p;
        url = u;
    }
    public String getMagnitude(){
        return  Double.toString(magnitude);
    }
    public String getLocation(){
        return place;
    }
    public long getTimeInMilliseconds(){
        return date;
    }

    public String getUrl() {
        return url;
    }
}
