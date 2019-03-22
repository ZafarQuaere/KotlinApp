package com.example.kotlinapp;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.util.List;

public class Utils {

    public static Address getLocationFromAddress(Context context, String strAddress) {

        Geocoder coder = new Geocoder(context);
        List<Address> address = null;
        //  GeoPoint p1 = null;

        try {
            address = coder.getFromLocationName(strAddress, 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (address == null)
            return null;

        Address location = address.get(0);
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();


       // return "Latitude : " +latitude + "  Longitude : " + longitude;

        return location;
    }
}
