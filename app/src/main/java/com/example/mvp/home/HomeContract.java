package com.example.mvp.home;

import com.example.mvp.base.BasePresenter;
import com.example.mvp.base.BaseView;
import com.example.mvp.data.NewsModel;

import java.util.List;

public interface HomeContract
{
    interface View extends BaseView{
        void showNews(List<NewsModel> newsList);

        void showError(String e);
    }
    interface Presenter extends BasePresenter<View>{
        void getNewsList();
    }





}
