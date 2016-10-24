package com.example.qianll;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity {
	private TextView textview;
	

	public FirstActivity() {
		
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);
		textview=(TextView)findViewById(R.id.textview);
		Button button1=(Button)findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				textview.setText("曾经有只放羊的小孩，每次无聊的时候都会爆我的照片，还污蔑我，并大喊狼来了...于是大人们赶过来发现狼并没有来...第二天他又继续爆我的照片，并大喊狼来了，大人们急匆匆赶过来发现还是没有狼。带三次他还这么做，于是狼真的来了，大人们却没有来，这则故事告诉我们，做人不可以随便爆人家照片，不然会被狼抓走！");
				
				// TODO 自动生成的方法存根
				
			}
			
		});
		Button button2=(Button)findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent);
				// TODO 自动生成的方法存根
				
			}
			
		});
		
	}

}
