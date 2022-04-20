package com.example.mvp.data;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient
{
    public static final String BASE_URL="";
    private static Retrofit retrofit=null;
    private static Context context;


    public ApiClient(Context context)
    {
        this.context=context;
    }
    public static Retrofit getClient()
    {
        if(retrofit==null)
        {

            retrofit=new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(BASE_URL)
                    .build();
        }

        return  retrofit;
    }


}