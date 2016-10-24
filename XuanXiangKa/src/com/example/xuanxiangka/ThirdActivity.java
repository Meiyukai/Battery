package com.example.xuanxiangka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {

	public ThirdActivity() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		TextView text=new TextView(this);
		text.setText("第三个选项卡");
		setContentView(text);
	}

}
