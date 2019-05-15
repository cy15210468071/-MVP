package com.aoto.library.mvp;

import android.content.Context;
import android.support.annotation.CallSuper;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BasePresenter<V extends IView, M extends IModel> {
    protected V mView;
    protected M mModel;

    //管理事件流订阅的生命周期CompositeDisposable
    private CompositeDisposable compositeDisposable;

    @CallSuper
    public void attachView(V view) {
        this.mView = view;
    }

    @CallSuper
    public void detachView() {
        if (mModel != null) {
            clearPool();
        }
        mModel = null;
        mView = null;
    }


    public Context getContext() {
        return mView.getContext();
    }

    /**
     * rxjava管理订阅者
     */
    protected void addDisposable(Disposable disposable) {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(disposable);
    }

    /**
     * 取消订阅关系
     * @return
     */
    public void clearPool() {
        if (compositeDisposable != null) {
            compositeDisposable.clear();
            compositeDisposable = null;
        }
    }

    public M getModel(){
        return  mModel;
    }

}
