package com.aoto.library.arouter;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 路由配置
 */
public class RouterConfig {
    public static void init(Application app, boolean isDebug){
        if (true){
            ARouter.openLog();   //打印
            ARouter.openDebug(); //调试
        }
        ARouter.init(app);
    }
}
