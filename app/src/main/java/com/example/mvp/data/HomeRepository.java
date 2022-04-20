package com.example.mvp.data;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public class HomeRepository implements HomeDataSource {

    HomeApiDataSource apiDataSource=new HomeApiDataSource();
    HomeLocalDataSource localDataSource=new HomeLocalDataSource();
    @Override
    public Observable<List<NewsModel>> getBanners() {
        return apiDataSource.getBanners();
    }

    @Override
    public Single<List<NewsModel>> getNews() {
        return apiDataSource.getNews();
    }
}
