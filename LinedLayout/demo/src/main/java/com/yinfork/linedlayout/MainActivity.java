package com.yinfork.linedlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * 北京博瑞彤芸文化传播股份有限公司  版权所有
 * Copyright (c) 2018. bjbrty.com  All Rights Reserved
 * @author 王丽君
 * Email：wanglijundev@gmail.com
 * 描述：
 * 修改历史:
 * 修改日期         作者        版本        描述说明
 *
 * 创建于： 2018/8/31 19:03
 **/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinedRelativeLayout layout = (LinedRelativeLayout) findViewById(R.id.layout_edit);

        if(null != layout) {
            layout.setIgnoreFirstFocus(true);
            layout.setLineWidth(3);
            layout.setLineColor(getResources().getColor(R.color.colorPrimary));
            layout.setBendLength(70);
            layout.setLinePaddingBottom(5);
            layout.setLinePaddingLeft(0);
            layout.setLinePaddingRight(0);
            layout.setAnimDuration(800);
        }
    }
}
