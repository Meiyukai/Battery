package com.example.qianll;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onStop() {
		Intent intent2=new Intent(SecondActivity.this,MyService.class);
		stopService(intent2);
		// TODO 自动生成的方法存根
		super.onStop();
	}

	
	private ImageView imgview;
	
	int imgs[]=new int[]{
			
			R.drawable.ling1,
			R.drawable.ling2,
			R.drawable.ling3,
			R.drawable.ling4,
			R.drawable.ling5,
			R.drawable.ling6,
			R.drawable.ling7,
			R.drawable.ling8,
			R.drawable.ling9,
			R.drawable.ling10,
			
			
	};
	int currentimg=0;
	private Handler handler=new Handler();
	private Runnable myrunnable=new Runnable(){

		@Override
		public void run() {
			handler.postDelayed(this, 1500);
			if(currentimg>=imgs.length-1){
				currentimg=-1;	
				}
			imgview.setImageResource(imgs[++currentimg]);
			// TODO 自动生成的方法存根
			
		}
		
	};

	
	


	public SecondActivity() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Intent intent=new Intent(SecondActivity.this,MyService.class);
		startService(intent);
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
		
		imgview=(ImageView)findViewById(R.id.imageView2);
		imgview.setImageResource(imgs[0]);
		
		Button button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				handler.post(myrunnable);
				// TODO 自动生成的方法存根
				
			}
			
		});
		
		
		
		
		
		Button button4=(Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:13218821996"));
				startActivity(intent);
				// TODO 自动生成的方法存根
				
			}
			
		});
		
		Button button5=(Button)findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				final AlertDialog.Builder dia=new AlertDialog.Builder(SecondActivity.this);
				dia.setTitle("想结束？回答一个问题");
				dia.setMessage("小凯帅？还是钱棱玲丑");
				dia.setCancelable(false);
				dia.setPositiveButton("钱棱玲丑", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						//Toast toast=new Toast(SecondActivity.this);
						Toast.makeText(SecondActivity.this, "你真聪明", Toast.LENGTH_LONG).show();
						dia.show();
						// TODO 自动生成的方法存根
						
					}
				});
				dia.setNegativeButton("小凯最帅", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						Toast.makeText(SecondActivity.this, "小凯最帅啦！啊啊哈哈哈！", Toast.LENGTH_LONG).show();
					     finish();
						// TODO 自动生成的方法存根
						
					}
				});
				dia.show();
				
				// TODO 自动生成的方法存根
				
			}
			
		});
		
		
	}

}
