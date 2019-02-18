package com.milkzz.infocard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     *
     * 主要用到的UI知识：RecyclerView 和CardView
     * 布局推荐使用约束布局，因为不需要做适配
     *
     * 实现功能： 可以展示一组组数据卡片，卡片信息包括视频，图片，景点名字，日志的跳转引导
     * 点击对应的引导进入到对应的页面，当前可以自定义假数据，推荐定义假数据格式为JSON格式，
     * 界面布局随意。主要实现功能。
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
