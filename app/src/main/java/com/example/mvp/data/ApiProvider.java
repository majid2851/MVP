package com.example.mvp.data;

public class ApiProvider
{
    //this class combine BaseUrl+Spcific Url
    public static  ApiService apiService;
    public static  ApiService apiProvider()
    {
        if (apiService==null)
        {
            apiService=  ApiClient.getClient().create( ApiService.class);
        }
        return apiService;

    }
}