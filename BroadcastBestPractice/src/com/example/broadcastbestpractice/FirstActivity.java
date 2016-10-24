package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_layout);
		Button button=(Button)findViewById(R.id.send_broadcast);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent("12345");
				sendBroadcast(intent);
				// TODO 自动生成的方法存根
				
			}
			
		});
		
	}

	public FirstActivity() {
		// TODO 自动生成的构造函数存根
	}

}
