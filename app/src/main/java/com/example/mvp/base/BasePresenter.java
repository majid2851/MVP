package com.example.mvp.base;

import java.util.List;

public interface BasePresenter<T extends BaseView>
{
    void attachView(T view);
    void detachView();



}
