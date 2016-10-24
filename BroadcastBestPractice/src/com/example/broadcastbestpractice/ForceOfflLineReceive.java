package com.example.broadcastbestpractice;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.WindowManager;

public class ForceOfflLineReceive extends BroadcastReceiver {
       

	

	@Override
	public void onReceive(final Context context, Intent arg1) {
		AlertDialog.Builder dialog=new AlertDialog.Builder(context);
		dialog.setTitle("警告");
		dialog.setCancelable(false);
		dialog.setMessage("您已被强制下线...");
		dialog.setNegativeButton("取消", new OnClickListener(){

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				ActivityCollector.finishAll();
				// TODO 自动生成的方法存根
				
			}
			
		});
		
		
		dialog.setPositiveButton("重新登录", new OnClickListener(){

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
		
				ActivityCollector.finishAll();
				Intent intent2=new Intent(context,LoginActivity.class);
				intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//设置一个flag才能完成
				context.startActivity(intent2);
				// TODO 自动生成的方法存根
				
			}
			
		});
		
		
		AlertDialog alertDialog=dialog.create();
		alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		alertDialog.show();
		// TODO 自动生成的方法存根

	}

}
