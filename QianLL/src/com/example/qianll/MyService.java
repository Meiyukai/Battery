package com.example.qianll;

import java.io.IOException;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.IBinder;

public class MyService extends Service {
	private MediaPlayer mp;

	public MyService() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void onDestroy() {
		mp.stop();
		mp.release();
		// TODO 自动生成的方法存根
		super.onDestroy();
	}

	@Override
	public void onCreate() {
		
		try {
			mp=new MediaPlayer();
			mp=MediaPlayer.create(MyService.this, R.raw.music);
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		// TODO 自动生成的方法存根
		super.onCreate();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		mp.start();
		mp.setOnCompletionListener(new OnCompletionListener(){

			@Override
			public void onCompletion(MediaPlayer arg0) {
				try{
					mp.start();
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				// TODO 自动生成的方法存根
				
			}
			
		});
		mp.setOnErrorListener(new OnErrorListener(){

			@Override
			public boolean onError(MediaPlayer arg0, int arg1, int arg2) {
				try{
					mp.release();
					
				}catch(Exception e){
					e.printStackTrace();
				}
				// TODO 自动生成的方法存根
				return false;
			}
			
		});
		// TODO 自动生成的方法存根
		super.onStart(intent, startId);
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO 自动生成的方法存根
		return null;
	}

}
