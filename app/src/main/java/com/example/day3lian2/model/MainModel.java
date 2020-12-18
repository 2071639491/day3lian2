package com.example.day3lian2.model;

import com.example.day3lian2.contract.MainContract;
import com.example.day3lian2.utils.INetCallBack;
import com.example.day3lian2.utils.Retrofitutils;

public class MainModel implements MainContract.IMainModel {

    @Override
    public <T> void onGet(String url, INetCallBack<T> iNetCallBack) {
        Retrofitutils.getRetrofitutils().get(url,iNetCallBack);
    }
}
