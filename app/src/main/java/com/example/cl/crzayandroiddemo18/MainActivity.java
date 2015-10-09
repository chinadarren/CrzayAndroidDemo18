package com.example.cl.crzayandroiddemo18;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


public class MainActivity extends Activity {
    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mauto;
    //定义字符串数组，作为提示的文本
    String[] books = new String[]{
            "疯狂JAVA义讲",
            "疯狂AJAX义讲",
            "疯狂XML义讲",
            "疯狂WORKFLOW义讲"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //创建一个ArrayAdapter封装数组
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, books);
        actv = (AutoCompleteTextView) findViewById(R.id.auto);
        //设置Adapter
        actv.setAdapter(aa);
        mauto = (MultiAutoCompleteTextView) findViewById(R.id.mauto);
        //设置Adapter
        mauto.setAdapter(aa);
        //为MoultiAutoCmpleteTextView设置分隔符
           mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


    }

}
