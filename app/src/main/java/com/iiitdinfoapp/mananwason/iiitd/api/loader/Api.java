package com.iiitdinfoapp.mananwason.iiitd.api.loader;

import com.iiitdinfoapp.mananwason.iiitd.api.protocol.mapResponseList;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by MananWason on 15-07-2015.
 */
public interface Api {
    @GET("/locations")
    void getLocations( Callback<mapResponseList> mapResponseListCallback);
}
