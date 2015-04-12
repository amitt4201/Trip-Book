package com.example.out2line2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		Button b1=(Button) findViewById(R.id.button1);
		Button b2=(Button) findViewById(R.id.button2);
		Button b3=(Button) findViewById(R.id.button3);
		Button b4=(Button) findViewById(R.id.button4);
		Button b6=(Button) findViewById(R.id.button6);
		final Intent i1=new Intent(this,GuruActivity.class);
		final Intent i2=new Intent(this,FourthActivity.class);
		final Intent i3=new Intent(this,FifthActivity.class);
		final Intent i4=new Intent(this,SecondActivity.class);
		final Intent i6=new Intent(this,SevenActivity.class);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(i1);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(i2);
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(i3);
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(i4);
			}
		});
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(i6);
			}
		});
	}
}
