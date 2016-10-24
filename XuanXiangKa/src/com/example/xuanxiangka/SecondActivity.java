package com.example.xuanxiangka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class SecondActivity extends Activity {

	public SecondActivity() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		TextView tex=new TextView(this);
		tex.setText("第二个选项卡");
		setContentView(tex);
		
		
	}

}
