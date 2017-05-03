package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 这行不冲突
        setContentView(R.layout.activity_main);
        // 这行肯定不冲，这次测试AS下对冲突的处理
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show();

        // 我在v1.0分支上加了这条。我就是要跟v1.1冲突，就改这行
        // q我也添加这行，怎么着吧
        // 靠靠靠！！这里要冲突了

        //再加点内容吧。

    }
}
