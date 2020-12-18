package com.example.day3lian2.contract;

import com.example.day3lian2.base.BaseView;
import com.example.day3lian2.bean.MainBean;
import com.example.day3lian2.utils.INetCallBack;

public class MainContract {
    public interface IMainView extends BaseView {
        void success(MainBean mainBean);
    }

    public interface IMainPresenter{
        void getSuccess();
    }
    public interface IMainModel{
        <T> void onGet(String url, INetCallBack<T> iNetCallBack);
    }
}
