package com.example.battery;

import android.app.Activity;
import android.app.ApplicationErrorReport.BatteryInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	private ToggleButton tb=null;
	private TextView textview=null;
	private BatteryReceiver receiver=null;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		tb=(ToggleButton)findViewById(R.id.tog_button);
		textview=(TextView)findViewById(R.id.text_view);
		IntentFilter filter=new IntentFilter();
		filter.addAction(Intent.ACTION_BATTERY_CHANGED);
		receiver=new BatteryReceiver();
		registerReceiver(receiver,filter);
	
	}
	
	
	
	
	
	@Override
	protected void onDestroy() {
		// TODO 自动生成的方法存根
		super.onDestroy();
		unregisterReceiver(receiver);
	}





	private class BatteryReceiver extends BroadcastReceiver {
		

		@Override
		public void onReceive(Context context, Intent intent) {
			//BatteryManager manager=(BatteryManager)getSystemService(Context.POWER_SERVICE);
			//BatteryInfo info=manager.get		
			int current=intent.getIntExtra("level",0);
			int total=intent.getIntExtra("scale",50);
			int per=current*100/total;
		    String x=Integer.toString(per);
			textview.setText(x);
			Toast.makeText(context, "电池电量有变化",Toast.LENGTH_LONG ).show();
			// TODO 自动生成的方法存根

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
