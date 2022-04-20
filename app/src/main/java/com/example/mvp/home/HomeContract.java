package com.example.mvp.home;

import com.example.mvp.base.BasePresenter;
import com.example.mvp.base.BaseView;
import com.example.mvp.data.News;

import java.util.List;

public interface HomeContract
{
    interface View extends BaseView{
        void showNews(List<News> newsList);
    }
    interface Presenter extends BasePresenter<View>{
        void getNewsList();
    }





}
