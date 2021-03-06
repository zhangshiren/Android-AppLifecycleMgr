package com.hm.iou.module1;

import android.content.Context;
import android.util.Log;

import com.hm.iou.lifecycle.annotation.AppLifeCycle;
import com.hm.lifecycle.api.IAppLike;

/**
 * Created by hjy on 2018/10/23.
 */
@AppLifeCycle
public class ModuleCAppLike implements IAppLike {

    @Override
    public int getPriority() {
        return MAX_PRIORITY;
    }

    @Override
    public void onCreate(Context context) {
        Log.d("AppLike", "onCreate(): this is in ModuleCAppLike.");
    }

    @Override
    public void onTerminate() {
        Log.d("AppLike", "onTerminate(): this is in ModuleCAppLike.");
    }
}
