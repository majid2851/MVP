package com.example.mvp.home;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvp.R;
import com.example.mvp.base.BaseFragment;
import com.example.mvp.data.HomeRepository;
import com.example.mvp.data.NewsModel;

import java.util.List;

public class HomeFragment extends BaseFragment implements HomeContract.View
{
    private HomeContract.Presenter presenter;
    private HomeRepository repository=new HomeRepository();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=new HomePresenter(repository);
    }

    @Override
    public Context getViewContext() {
        return null;
    }

    @Override
    public void showNews(List<NewsModel> newsList) {



    }

    @Override
    public void showError(String e) {

    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.attachView(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.detachView();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void init() {


    }
}
