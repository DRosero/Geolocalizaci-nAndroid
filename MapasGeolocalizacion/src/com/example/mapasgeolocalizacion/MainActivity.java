package com.example.mapasgeolocalizacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {

	private GoogleMap mMap;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setUpMapIfNeeded();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	private void setUpMapIfNeeded() {
		// Configuramos el objeto GoogleMaps con valores iniciales.
		   if (mMap == null) {
		      //Instanciamos el objeto mMap a partir del MapFragment definido bajo el Id "map"
			   
		      mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		      // Chequeamos si se ha obtenido correctamente una referencia al objeto GoogleMap
		      if (mMap != null) {
		        // El objeto GoogleMap ha sido referenciado correctamente 
		        //ahora podemos manipular sus propiedades
		        
		        //Seteamos el tipo de mapa 
		        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		        	
		        //Activamos la capa o layer MyLocation
		        mMap.setMyLocationEnabled(true);
		      }
		   }
	}
	
	private void setMarker(LatLng position, String titulo, String info) {
		  // Agregamos marcadores para indicar sitios de interéses.
		  Marker myMaker = mMap.addMarker(new MarkerOptions()
		       .position(position)
		       .title(titulo)  //Agrega un titulo al marcador
		       .snippet(info)   //Agrega información detalle relacionada con el marcador 
		       .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))); //Color del marcador
		}
}
