package com.example.qianll;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity {
	private TextView textview;
	

	public FirstActivity() {
		
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);
		textview=(TextView)findViewById(R.id.textview);
		Button button1=(Button)findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				textview.setText("������ֻ�����С����ÿ�����ĵ�ʱ�򶼻ᱬ�ҵ���Ƭ���������ң�����������...���Ǵ����ǸϹ��������ǲ�û����...�ڶ������ּ������ҵ���Ƭ�����������ˣ������Ǽ��ҴҸϹ������ֻ���û���ǡ�������������ô����������������ˣ�������ȴû������������¸������ǣ����˲�������㱬�˼���Ƭ����Ȼ�ᱻ��ץ�ߣ�");
				
				// TODO �Զ����ɵķ������
				
			}
			
		});
		Button button2=(Button)findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent);
				// TODO �Զ����ɵķ������
				
			}
			
		});
		
	}

}
