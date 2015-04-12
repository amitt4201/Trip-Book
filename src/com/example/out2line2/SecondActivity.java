package com.example.out2line2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Button b=(Button) findViewById(R.id.button1);
		final Intent i2=new Intent(this,ThirdActivity.class);
		final EditText et1=(EditText) findViewById(R.id.editText1);
		final EditText et2=(EditText) findViewById(R.id.editText2);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String i=et1.getText().toString(),o="";
				String j=et2.getText().toString(),r="";
				if(!i.equals("user") && !j.equals("user")){
					Toast.makeText(getApplication(), "Invalid Username", Toast.LENGTH_SHORT).show();
				}
				else
				{
					startActivity(i2);
				}
				
			}
		});
		
	
	}

}
