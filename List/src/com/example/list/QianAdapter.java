package com.example.list;

import java.util.List;

import android.R.layout;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class QianAdapter extends ArrayAdapter<Qian> {
	
	private int resourceid;
	public QianAdapter(Context context, int textViewResourceId,
			List<Qian> objects) {
		super(context,  textViewResourceId, objects);
		resourceid=textViewResourceId;
		// TODO 自动生成的构造函数存根
	}
	
		
		
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Qian qian=getItem(position);
		View view = null;
		viewHolder holder;
		if(convertView==null){
			view=LayoutInflater.from(getContext()).inflate(resourceid, null);
			holder=new viewHolder();
			holder.qianimg=(ImageView)view.findViewById(R.id.imgview);
			holder.qiantext=(TextView)view.findViewById(R.id.text_view);
			view.setTag(holder);
			
		}else{
			view=convertView;
			holder=(viewHolder)view.getTag();
			
		}
		holder.qianimg.setImageResource(qian.getimg());
		holder.qiantext.setText(qian.getname());

		// TODO 自动生成的方法存根
		return view;
	}
	class viewHolder{
		ImageView qianimg;
		TextView qiantext;
	}

}
