package com.example.xuanxiangka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class SecondActivity extends Activity {

	public SecondActivity() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		TextView tex=new TextView(this);
		tex.setText("�ڶ���ѡ�");
		setContentView(tex);
		
		
	}

}
