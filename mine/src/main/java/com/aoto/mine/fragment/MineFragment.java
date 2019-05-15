package com.aoto.mine.fragment;


import android.view.View;
import android.widget.TextView;

import com.aoto.library.mvp.BaseFragment;
import com.aoto.mine.R;
import com.aoto.mine.presenter.MinePresenter;
import com.aoto.mine.view.MineView;
import com.gyf.immersionbar.ImmersionBar;

public class MineFragment extends BaseFragment<MinePresenter> implements MineView, View.OnClickListener {
    TextView tv_title;

    @Override
    public void onClick(android.view.View v) {

    }

    @Override
    public int getContentView() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initView() {
        ImmersionBar.with(this)
                .statusBarView(R.id.title_view)
                .statusBarColor(R.color.priority_blue_1)
                .navigationBarColor(R.color.priority_blue_1)
                .init();
        tv_title = getView().findViewById(R.id.toolbar_title_content);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        tv_title.setText("个人中心");
    }

    @Override
    public void showHUD(String msg) {

    }

    @Override
    public void dismissHUD() {

    }
}
