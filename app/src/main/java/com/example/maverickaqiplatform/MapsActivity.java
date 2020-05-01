package com.example.maverickaqiplatform;

import androidx.fragment.app.FragmentActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        DownloadTaskNew taskNew = new DownloadTaskNew();
        taskNew.execute("https://api.waqi.info/feed/kabul/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew1 = new DownloadTaskNew();
        taskNew1.execute("https://api.waqi.info/feed/algiers/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew2 = new DownloadTaskNew();
        taskNew2.execute("https://api.waqi.info/feed/buenosaires/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew3 = new DownloadTaskNew();
        taskNew3.execute("https://api.waqi.info/feed/canberra/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew4 = new DownloadTaskNew();
        taskNew4.execute("https://api.waqi.info/feed/manama/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew5 = new DownloadTaskNew();
        taskNew5.execute("https://api.waqi.info/feed/dhaka/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew6 = new DownloadTaskNew();
        taskNew6.execute("https://api.waqi.info/feed/brussels/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew7 = new DownloadTaskNew();
        taskNew7.execute("https://api.waqi.info/feed/sarajevo/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew8 = new DownloadTaskNew();
        taskNew8.execute("https://api.waqi.info/feed/brasilia/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew9 = new DownloadTaskNew();
        taskNew9.execute("https://api.waqi.info/feed/sofia/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew10 = new DownloadTaskNew();
        taskNew10.execute("https://api.waqi.info/feed/ottawa/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew11 = new DownloadTaskNew();
        taskNew11.execute("https://api.waqi.info/feed/chile/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew12 = new DownloadTaskNew();
        taskNew12.execute("https://api.waqi.info/feed/beijing/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew13 = new DownloadTaskNew();
        taskNew13.execute("https://api.waqi.info/feed/bogota/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew14 = new DownloadTaskNew();
        taskNew14.execute("https://api.waqi.info/feed/zagreb/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew15 = new DownloadTaskNew();
        taskNew15.execute("https://api.waqi.info/feed/prague/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew16 = new DownloadTaskNew();
        taskNew16.execute("https://api.waqi.info/feed/copenhagen/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew17 = new DownloadTaskNew();
        taskNew17.execute("https://api.waqi.info/feed/quito/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew18 = new DownloadTaskNew();
        taskNew18.execute("https://api.waqi.info/feed/addisababa/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew19 = new DownloadTaskNew();
        taskNew19.execute("https://api.waqi.info/feed/helsinki/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew20 = new DownloadTaskNew();
        taskNew20.execute("https://api.waqi.info/feed/paris/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew21 = new DownloadTaskNew();
        taskNew21.execute("https://api.waqi.info/feed/berlin/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew22 = new DownloadTaskNew();
        taskNew22.execute("https://api.waqi.info/feed/accra/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew23 = new DownloadTaskNew();
        taskNew23.execute("https://api.waqi.info/feed/athens/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew24 = new DownloadTaskNew();
        taskNew24.execute("https://api.waqi.info/feed/conakry/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew25 = new DownloadTaskNew();
        taskNew25.execute("https://api.waqi.info/feed/budapest/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew26 = new DownloadTaskNew();
        taskNew26.execute("https://api.waqi.info/feed/reykjavik/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew27 = new DownloadTaskNew();
        taskNew27.execute("https://api.waqi.info/feed/newdelhi/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew28 = new DownloadTaskNew();
        taskNew28.execute("https://api.waqi.info/feed/jakarta/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew29 = new DownloadTaskNew();
        taskNew29.execute("https://api.waqi.info/feed/tehran/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew30 = new DownloadTaskNew();
        taskNew30.execute("https://api.waqi.info/feed/baghdad/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew31 = new DownloadTaskNew();
        taskNew31.execute("https://api.waqi.info/feed/dublin/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew32 = new DownloadTaskNew();
        taskNew32.execute("https://api.waqi.info/feed/jerusalem/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew33 = new DownloadTaskNew();
        taskNew33.execute("https://api.waqi.info/feed/rome/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew34 = new DownloadTaskNew();
        taskNew34.execute("https://api.waqi.info/feed/tokyo/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew35 = new DownloadTaskNew();
        taskNew35.execute("https://api.waqi.info/feed/amman/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew36 = new DownloadTaskNew();
        taskNew36.execute("https://api.waqi.info/feed/kuwait/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew37 = new DownloadTaskNew();
        taskNew37.execute("https://api.waqi.info/feed/bishkek/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew38 = new DownloadTaskNew();
        taskNew38.execute("https://api.waqi.info/feed/vilnius/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew39 = new DownloadTaskNew();
        taskNew39.execute("https://api.waqi.info/feed/luxemborg/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew40 = new DownloadTaskNew();
        taskNew40.execute("https://api.waqi.info/feed/kualalumpur/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew41 = new DownloadTaskNew();
        taskNew41.execute("https://api.waqi.info/feed/valletta/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew42 = new DownloadTaskNew();
        taskNew42.execute("https://api.waqi.info/feed/mexico/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew43 = new DownloadTaskNew();
        taskNew43.execute("https://api.waqi.info/feed/amsterdam/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew44 = new DownloadTaskNew();
        taskNew44.execute("https://api.waqi.info/feed/wellington/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew45 = new DownloadTaskNew();
        taskNew45.execute("https://api.waqi.info/feed/oslo/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew46 = new DownloadTaskNew();
        taskNew46.execute("https://api.waqi.info/feed/islamabad/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew47 = new DownloadTaskNew();
        taskNew47.execute("https://api.waqi.info/feed/manila/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew48 = new DownloadTaskNew();
        taskNew48.execute("https://api.waqi.info/feed/warsaw/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew49 = new DownloadTaskNew();
        taskNew49.execute("https://api.waqi.info/feed/lisbon/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew50 = new DownloadTaskNew();
        taskNew50.execute("https://api.waqi.info/feed/moscow/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew51 = new DownloadTaskNew();
        taskNew51.execute("https://api.waqi.info/feed/riyadh/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew52 = new DownloadTaskNew();
        taskNew52.execute("https://api.waqi.info/feed/belgrade/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew53 = new DownloadTaskNew();
        taskNew53.execute("https://api.waqi.info/feed/singapore/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew54 = new DownloadTaskNew();
        taskNew54.execute("https://api.waqi.info/feed/pretoria/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew55 = new DownloadTaskNew();
        taskNew55.execute("https://api.waqi.info/feed/seoul/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew56 = new DownloadTaskNew();
        taskNew56.execute("https://api.waqi.info/feed/madrid/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew57 = new DownloadTaskNew();
        taskNew57.execute("https://api.waqi.info/feed/colombo/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew58 = new DownloadTaskNew();
        taskNew58.execute("https://api.waqi.info/feed/stockholm/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew59 = new DownloadTaskNew();
        taskNew59.execute("https://api.waqi.info/feed/bern/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew60 = new DownloadTaskNew();
        taskNew60.execute("https://api.waqi.info/feed/bangkok/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew61 = new DownloadTaskNew();
        taskNew61.execute("https://api.waqi.info/feed/ankara/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew62 = new DownloadTaskNew();
        taskNew62.execute("https://api.waqi.info/feed/abudhabi/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew63 = new DownloadTaskNew();
        taskNew63.execute("https://api.waqi.info/feed/london/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
        DownloadTaskNew taskNew64 = new DownloadTaskNew();
        taskNew64.execute("https://api.waqi.info/feed/washington/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
    }

    public class DownloadTaskNew extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            String result = "";
            URL url;
            HttpURLConnection urlConnection = null;
            try {
                url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while (data != -1) {
                    char current = (char) data;
                    result += current;
                    data = reader.read();
                }
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONObject jsonObject = new JSONObject(s);
                String data = jsonObject.getString("data");
                JSONObject jsonObject1 = new JSONObject(data);
                String aqi = jsonObject1.getString("aqi");
                double aqiNum = Double.parseDouble(aqi);
                Log.i("aqi", aqi);
                String city = jsonObject1.getString("city");
                JSONObject jsonObject2 = new JSONObject(city);
                String geo = jsonObject2.getString("geo");
                JSONArray arr = new JSONArray(geo);
                LatLng seattle = new LatLng(arr.getDouble(0), arr.getDouble(1));
                String name = jsonObject2.getString("name");
                float col;
                if(aqiNum<=50)
                    col = BitmapDescriptorFactory.HUE_GREEN;
                else if(aqiNum>50 && aqiNum<=100)
                    col = BitmapDescriptorFactory.HUE_YELLOW;
                else if(aqiNum>100 && aqiNum<=150)
                    col = BitmapDescriptorFactory.HUE_ORANGE;
                else if(aqiNum>150 && aqiNum<=200)
                    col = BitmapDescriptorFactory.HUE_RED;
                else if(aqiNum>200 && aqiNum<=300)
                    col = BitmapDescriptorFactory.HUE_VIOLET;
                else
                    col = BitmapDescriptorFactory.HUE_ROSE;
                mMap.addMarker(new MarkerOptions().position(seattle).title(name).snippet("AQI : " + aqi).icon(BitmapDescriptorFactory.defaultMarker(col)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
