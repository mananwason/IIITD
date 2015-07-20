package com.iiitdinfoapp.mananwason.iiitd.api.processor;

import android.util.Log;

import com.iiitdinfoapp.mananwason.iiitd.Model.Map;
import com.iiitdinfoapp.mananwason.iiitd.api.protocol.mapResponseList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by MananWason on 20-07-2015.
 */
public class MapListResponseProcessor implements Callback<mapResponseList> {
    @Override
    public void success(mapResponseList mapResponseList, Response response) {

        for (Map map : mapResponseList.maps) {
            Log.d("TITLE", map.getTitle());
        }
    }

    @Override
    public void failure(RetrofitError error) {

    }
}
