package com.example.day3lian2.presenter;

import com.example.day3lian2.base.BasePresenter;
import com.example.day3lian2.bean.MainBean;
import com.example.day3lian2.contract.MainContract;
import com.example.day3lian2.model.MainModel;
import com.example.day3lian2.utils.INetCallBack;
import com.example.day3lian2.utils.Retrofitutils;
import com.example.day3lian2.utils.URLConstant;

public class MianPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {
    private MainContract.IMainModel iMainModel;


    public MianPresenter(MainContract.IMainView iMainView) {
        iMainModel=new MainModel();
    }


    @Override
    public void getSuccess() {
        iMainModel.onGet(URLConstant.NEWLIST, new INetCallBack<MainBean>() {
            @Override
            public void onSuccess(MainBean mainBean) {
                iView.success(mainBean);
            }

            @Override
            public void onFail(String error) {

            }
        });
    }
}
