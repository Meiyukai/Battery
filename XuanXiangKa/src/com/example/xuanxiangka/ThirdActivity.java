package com.example.xuanxiangka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {

	public ThirdActivity() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		TextView text=new TextView(this);
		text.setText("������ѡ�");
		setContentView(text);
	}

}
