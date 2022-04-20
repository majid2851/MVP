package com.example.mvp.home;

import com.example.mvp.data.HomeDataSource;
import com.example.mvp.data.HomeRepository;
import com.example.mvp.data.NewsModel;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomePresenter implements HomeContract.Presenter
{
    private HomeContract.View view;
    private HomeDataSource homeDataSource;
    private CompositeDisposable disposable=new CompositeDisposable();

    public HomePresenter(HomeDataSource homeDataSource){
        this.homeDataSource=homeDataSource;
    }

    @Override
    public void attachView(HomeContract.View view) {
        this.view=view;

    }

    @Override
    public void detachView() {
        view=null;
        disposable.clear();
    }

    @Override
    public void getNewsList()
    {
        homeDataSource.getNews().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).
                subscribe(new SingleObserver<List<NewsModel>>() {
            @Override
            public void onSubscribe(Disposable d) {
                disposable.add(d);
            }

            @Override
            public void onSuccess(List<NewsModel> newsModels) {
                view.showNews(newsModels);
            }

            @Override
            public void onError(Throwable e) {
                view.showError(e.toString());
            }
        });
    }



}
