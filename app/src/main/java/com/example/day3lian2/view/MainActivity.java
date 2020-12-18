package com.example.day3lian2.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.day3lian2.R;
import com.example.day3lian2.adapter.MainAdapter;
import com.example.day3lian2.base.BaseActivity;
import com.example.day3lian2.bean.MainBean;
import com.example.day3lian2.contract.MainContract;
import com.example.day3lian2.presenter.MianPresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MianPresenter> implements MainContract.IMainView {

    //开始分
    //分了
    private RecyclerView mRlv;
    private ArrayList<MainBean.StudenlistBean> list;
    private MainAdapter adapter;

    @Override
    protected void initData() {
        presenter.getSuccess();
    }

    @Override
    protected void initView() {
        mRlv = findViewById(R.id.rlv);
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new MainAdapter(this, list);
        mRlv.setAdapter(adapter);
    }

    @Override
    protected MianPresenter add() {
        return new MianPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void success(MainBean mainBean) {
        list.addAll(mainBean.getStudenlist());
        adapter.notifyDataSetChanged();
    }
}