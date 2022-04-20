package com.example.mvp.data;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public interface HomeDataSource
{
    Observable<List<NewsModel>> getBanners();
    Single<List<NewsModel>> getNews();


}
