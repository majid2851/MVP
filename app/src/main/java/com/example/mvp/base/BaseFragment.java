package com.example.mvp.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvp.home.HomeContract;

public abstract class BaseFragment extends Fragment
{
    public View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        if (rootView==null) {
            rootView=inflater.inflate(getLayout(),container,false);
            init();
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public abstract int getLayout();
    public abstract void init();
}
