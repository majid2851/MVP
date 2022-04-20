package com.example.mvp.data;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiService
{

    @GET("")
    Single<List<NewsModel>> getNews();
}
