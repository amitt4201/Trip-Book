package com.example.out2line2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SevenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seven);
		Button b=(Button) findViewById(R.id.button1);
		EditText et1=(EditText) findViewById(R.id.t1);
		EditText et2=(EditText) findViewById(R.id.t2);
		final Intent i2=new Intent(this,EightActivity.class);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(i2);
				Toast.makeText(getApplicationContext(), "You have earned some credit", Toast.LENGTH_LONG).show();
				}
		});
		
	}
}
