package com.example.xuanxiangka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class FirstActivity extends Activity {

	public FirstActivity() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		TextView text=new TextView(this);
		text.setText("第一个选项卡");
		setContentView(text);
	}

}
