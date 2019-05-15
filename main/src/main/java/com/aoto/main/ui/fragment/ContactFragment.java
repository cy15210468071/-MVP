package com.aoto.main.ui.fragment;


import android.view.View;
import android.widget.TextView;

import com.aoto.library.mvp.BaseFragment;
import com.aoto.main.R;
import com.aoto.main.ui.presenter.MessagePresenter;
import com.aoto.main.ui.view.MessageView;
import com.gyf.immersionbar.ImmersionBar;

public class ContactFragment extends BaseFragment<MessagePresenter> implements MessageView, View.OnClickListener {
    TextView tv_title;
    TextView tv_msg;

    @Override
    public void onClick(android.view.View v) {

    }

    @Override
    public int getContentView() {
        return R.layout.fragment_message;
    }

    @Override
    public void initView() {
        ImmersionBar.with(this)
                .statusBarView(R.id.title_view)
                .statusBarColor(R.color.priority_blue_1)
                .navigationBarColor(R.color.priority_blue_1)
                .init();
        tv_title = getView().findViewById(R.id.toolbar_title_content);
        tv_msg = getView().findViewById(R.id.tv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        tv_title.setText("通讯录");
        tv_msg.setText("通讯录");
    }

    @Override
    public void showHUD(String msg) {

    }

    @Override
    public void dismissHUD() {

    }
}
