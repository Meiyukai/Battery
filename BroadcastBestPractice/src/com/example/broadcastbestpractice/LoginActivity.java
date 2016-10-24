package com.example.broadcastbestpractice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
	private EditText account;
	private EditText password;
	private Button login;
	private SharedPreferences pre;
	private SharedPreferences.Editor editor;

	public LoginActivity() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);
		account=(EditText)findViewById(R.id.account_edit);
		password=(EditText)findViewById(R.id.password_edit);
		final CheckBox box=(CheckBox)findViewById(R.id.remember_pass);
		
		pre=PreferenceManager.getDefaultSharedPreferences(this);
		boolean isRemember=pre.getBoolean("remember_password", false);
		if(isRemember){
			String accou=pre.getString("account"," ");
			String pass=pre.getString("password", " ");
			account.setText(accou);
			password.setText(pass);
			box.setChecked(true);
			
		}
		
		login=(Button)findViewById(R.id.loging_button);
		login.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				String acc=account.getText().toString();
				String pas=password.getText().toString();
				if(acc.equals("meiyukai")&&pas.equals("123456")){
					editor=pre.edit();
					if(box.isChecked()){
						String accounttext=account.getText().toString();
						String passwordtext=password.getText().toString();
						editor.putString("account", accounttext);
						editor.putString("password",passwordtext);
						editor.putBoolean("remember_password", true);
						
						
					}
					else{
						editor.clear();
					}
					editor.commit();
					Intent intent=new Intent(LoginActivity.this,FirstActivity.class);
					startActivity(intent);
					finish();//登录完成后销毁当前活动
				}
				else{
					Toast.makeText(LoginActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT);
				}
				
				// TODO 自动生成的方法存根
				
			}
			
		});
	}

}
