package com.iiitdinfoapp.mananwason.iiitd.api;

import com.google.gson.Gson;
import com.iiitdinfoapp.mananwason.iiitd.Utils.URLs;
import com.iiitdinfoapp.mananwason.iiitd.api.loader.Api;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by MananWason on 15-07-2015.
 */
public class ApiClient {
    static final int CONNECT_TIMEOUT_MILLIS = 20 * 1000; // 15s

    static final int READ_TIMEOUT_MILLIS = 50 * 1000; // 20s

    static final Gson gson = new Gson();

    private final Api api;

    public ApiClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new GsonConverter(gson))
                .setEndpoint(URLs.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        api = restAdapter.create(Api.class);

    }

    public Api getApi() {
        return api;
    }

}
