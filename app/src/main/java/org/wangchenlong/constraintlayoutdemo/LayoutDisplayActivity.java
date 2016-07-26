package org.wangchenlong.constraintlayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 显示Layout的页面
 * <p>
 * Created by wangchenlong on 16/7/25.
 */

public class LayoutDisplayActivity extends AppCompatActivity {
    private static final String TAG = "DEBUG-WCL: " + LayoutDisplayActivity.class.getSimpleName();

    public static final String EXTRA_LAYOUT_ID = TAG + ".layoutId";

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(getIntent().getStringExtra(Intent.EXTRA_TITLE));
        final int layoutId = getIntent().getIntExtra(EXTRA_LAYOUT_ID, 0);
        setContentView(layoutId); // 设置页面布局, 复用布局
    }
}
