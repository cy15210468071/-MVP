package com.aoto.main.ui.presenter;

import android.app.Activity;

import com.aoto.library.mvp.BasePresenter;
import com.aoto.main.ui.view.MessageView;

import io.reactivex.disposables.CompositeDisposable;

public class MessagePresenter extends BasePresenter<MessageView.View,MessageView.Model> implements MessageView.Presenter {
    private Activity activity;
    private CompositeDisposable mDisposable;

    public MessagePresenter(Activity activity) {
        this.activity = activity;
        mDisposable = new CompositeDisposable();
    }
}
