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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void onDestroy() {
		mp.stop();
		mp.release();
		// TODO �Զ����ɵķ������
		super.onDestroy();
	}

	@Override
	public void onCreate() {
		
		try {
			mp=new MediaPlayer();
			mp=MediaPlayer.create(MyService.this, R.raw.music);
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		// TODO �Զ����ɵķ������
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
				
				// TODO �Զ����ɵķ������
				
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
				// TODO �Զ����ɵķ������
				return false;
			}
			
		});
		// TODO �Զ����ɵķ������
		super.onStart(intent, startId);
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
