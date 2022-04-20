package com.example.mvp.data;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public class HomeApiDataSource implements HomeDataSource
{
    @Override
    public Observable<List<NewsModel>> getBanners() {
        return null;
    }

    @Override
    public Single<List<NewsModel>> getNews() {
        return ApiProvider.apiProvider().getNews();
    }
}
