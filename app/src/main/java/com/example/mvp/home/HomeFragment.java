package com.example.mvp.home;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvp.data.News;

import java.util.List;

public class HomeFragment extends Fragment implements HomeContract.View
{
    private HomeContract.Presenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=new HomePresenter();
    }

    @Override
    public Context getViewContext() {
        return null;
    }

    @Override
    public void showNews(List<News> newsList) {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
