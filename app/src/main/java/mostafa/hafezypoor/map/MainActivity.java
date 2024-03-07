package mostafa.hafezypoor.map;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
private GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment supportMapFragment= (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fmap);
        supportMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.googleMap=googleMap;
        LatLng myLocation = new LatLng(34.016774, 58.168308);
        LatLng myLocation2 = new LatLng(32.635365282764134, 50.372350179732734);
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
       Marker a1= googleMap.addMarker(new MarkerOptions().position(myLocation).title("فردوس"));
       a1.setTitle("اینجا موز  میدن");
       a1.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
    googleMap.addMarker(new MarkerOptions().position(myLocation2).title("تهران")).setTitle("اینجا هیچی نمیدن");
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));
        googleMap.getUiSettings().setZoomControlsEnabled(true);

    }
}