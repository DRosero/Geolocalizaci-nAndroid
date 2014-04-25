package com.example.mapasgeolocalizacion;

import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.app.Activity;
import android.os.Bundle;


public class Mapa extends Activity {
	
	/*implements
GooglePlayServicesClient.ConnectionCallbacks,
GooglePlayServicesClient.OnConnectionFailedListener*/
	
	private static LocationRequest mLocRequest;
    private static LocationClient mLocClient;    
    private LocationListener listener;
    
    private GoogleMap mMap;
	private LatLng ECUADOR = new LatLng(-0.14767804852251168,
			-78.47342852172847);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ECUADOR, 12));
		
		mMap.addMarker(new MarkerOptions().position(
				new LatLng(43.533, 85.948)).title(
				"Hola"));

		/*mLocRequest = LocationRequest.create();
        mLocRequest.setInterval(30000);
        mLocRequest.setSmallestDisplacement(5);
        mLocRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        mLocClient = new LocationClient(this,this,this);
        if(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this) == ConnectionResult.SUCCESS){
           mLocClient.connect();
        }*/
        
        
        	}
	
	
	
	/*@Override
    protected void onResume() {
        super.onResume();
        if(mLocClient.isConnected())
            if(listener == null)
                    listener = new LocationListener() {
                        @Override
                        public void onLocationChanged(Location location) {
                           //do_something_here();
                        }
                    };
            mLocClient.requestLocationUpdates(mLocRequest,listener);
        
            mLocClient.connect();
    }
 
    @Override
    protected void onPause() {
        super.onPause();
        mLocClient.removeLocationUpdates(listener);
    }

	@Override
	public void onConnectionFailed(ConnectionResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConnected(Bundle arg0) {
		// TODO Auto-generated method stub
		updateLocation();
		
	}
	
	public void updateLocation(){
        listener = new LocationListener() {
			
			@Override
			public void onLocationChanged(Location location) {
				// TODO Auto-generated method stub
				
			}
		};
        mLocClient.requestLocationUpdates(mLocRequest, listener);
	}

	@Override
	public void onDisconnected() {
		// TODO Auto-generated method stub
		
	}*/
	
		
	
}
