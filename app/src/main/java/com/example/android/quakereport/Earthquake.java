package com.example.android.quakereport;

/**
 * Created by manug on 3/26/2018.
 */

public class Earthquake {
    double magnitude;
    long date;
    String place;
    public Earthquake(String p,long d,double m){
        magnitude=m;
        date=d;
        place=p;
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
}
