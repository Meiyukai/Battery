package com.example.xuanxiangka;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;
import android.content.res.Resources;

public class MianActivity extends Activity {
	private TabHost host;

	public MianActivity() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.tab_host_layout);
		host=(TabHost)findViewById(android.R.id.tabhost);
		host.setup();
		LayoutInflater inflater=LayoutInflater.from(this);
		
		
		inflater.inflate(R.layout.tab1, host.getTabContentView());
		inflater.inflate(R.layout.tab2, host.getTabContentView());
		inflater.inflate(R.layout.tab3,host.getTabContentView());
		 
		host.addTab(host.newTabSpec("01").setIndicator("����").setContent(R.id.linear_layout1));
		host.addTab(host.newTabSpec("02").setIndicator("�ռ�").setContent(R.id.linear_layout2));
		host.addTab(host.newTabSpec("03").setIndicator("��ϵ��").setContent(R.id.linear_layout3));
		host.setCurrentTabByTag("01");
		
		
		Button button=(Button)findViewById(R.id.button_1);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(MianActivity.this, "�ѵ���",Toast.LENGTH_SHORT).show();
				// TODO �Զ����ɵķ������
				
			}
			
			
		});
		
		
		
		
		
	}

}
