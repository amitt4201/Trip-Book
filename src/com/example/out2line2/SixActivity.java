package com.example.out2line2;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class SixActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_six);
		LocationManager mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

		  LocationListener mlocListener = new MyLocationListener();
		  mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
	}
	public class MyLocationListener implements LocationListener
	{

	  @Override
	  public void onLocationChanged(Location loc)
	  {
	   double CURRENT_LAT = loc.getLatitude();
	   double CURRENT_LNG = loc.getLongitude();
	  }

	  @Override
	  public void onProviderDisabled(String provider)
	  {
	    Toast.makeText( getApplicationContext(), "Gps Disabled", Toast.LENGTH_SHORT ).show();
	  }

	  @Override
	  public void onProviderEnabled(String provider)
	  {
	    Toast.makeText( getApplicationContext(), "Gps Enabled", Toast.LENGTH_SHORT).show();
	  }

	  @Override
	  public void onStatusChanged(String provider, int status, Bundle extras)
	  {

	  }
	}
}
