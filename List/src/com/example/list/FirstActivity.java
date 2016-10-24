package com.example.list;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class FirstActivity extends Activity {
	private List<Qian> qianlist=new ArrayList<Qian>();

	public FirstActivity() {
		
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_layout);
		
		
		float xdpi=getResources().getDisplayMetrics().xdpi;
		float ydpi=getResources().getDisplayMetrics().ydpi;
		Log.d("�һ","xdpi��"+xdpi);
		Log.d("�һ","ydpi��"+ydpi);
		
		
		
		
		initqian();
		QianAdapter adapter=new QianAdapter(FirstActivity.this,R.layout.first_layout,qianlist);
		ListView listview=(ListView)findViewById(R.id.list_view);
		listview.setAdapter(adapter);
		
		
	}

	private void initqian() {
		Qian qian1=new Qian("Ǯ����",R.drawable.ling1);
		qianlist.add(qian1);
		Qian qian2=new Qian("Ǯ����",R.drawable.ling2);
		qianlist.add(qian2);
		Qian qian3=new Qian("Ǯ����",R.drawable.ling3);
		qianlist.add(qian3);
		Qian qian4=new Qian("Ǯ����",R.drawable.ling4);
		qianlist.add(qian4);
		Qian qian5=new Qian("Ǯ����",R.drawable.ling5);
		qianlist.add(qian5);
		Qian qian6=new Qian("Ǯ����",R.drawable.ling6);
		qianlist.add(qian6);
		Qian qian7=new Qian("Ǯ����",R.drawable.ling7);
		qianlist.add(qian7);
		Qian qian8=new Qian("Ǯ����",R.drawable.ling8);
		qianlist.add(qian8);
		
				
				
		};
		// TODO �Զ����ɵķ������
		
	}


