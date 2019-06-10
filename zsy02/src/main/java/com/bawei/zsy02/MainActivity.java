package com.bawei.zsy02;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.adapter.MyAdapter;
import com.bawei.fragment.FirstFragment;
import com.bawei.fragment.SecondeFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private TabLayout tab;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        pager = findViewById(R.id.pager);
        tab = findViewById(R.id.tab);
        //添加资源
        fragments.add(new FirstFragment());
        fragments.add(new SecondeFragment());
        list.add("首页");
        list.add("我的");
        //创建适配器
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(), list, fragments);
        //设置适配器
        pager.setAdapter(myAdapter);
        //绑定tab和view
        tab.setupWithViewPager(pager);
    }
}
