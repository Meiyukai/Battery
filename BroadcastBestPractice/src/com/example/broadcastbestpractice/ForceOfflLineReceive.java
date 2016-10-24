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
		dialog.setTitle("����");
		dialog.setCancelable(false);
		dialog.setMessage("���ѱ�ǿ������...");
		dialog.setNegativeButton("ȡ��", new OnClickListener(){

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				ActivityCollector.finishAll();
				// TODO �Զ����ɵķ������
				
			}
			
		});
		
		
		dialog.setPositiveButton("���µ�¼", new OnClickListener(){

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
		
				ActivityCollector.finishAll();
				Intent intent2=new Intent(context,LoginActivity.class);
				intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//����һ��flag�������
				context.startActivity(intent2);
				// TODO �Զ����ɵķ������
				
			}
			
		});
		
		
		AlertDialog alertDialog=dialog.create();
		alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		alertDialog.show();
		// TODO �Զ����ɵķ������

	}

}
