package com.example.maverickaqiplatform;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CityInformationActivity extends AppCompatActivity {

    EditText cityEditText;
    TextView cityTextView;
    TextView aqiTextView;
    TextView iaqiTextView;
    TextView stationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_information);

        cityEditText = (EditText)findViewById(R.id.cityEditText);
        cityTextView = (TextView)findViewById(R.id.cityTextView);
        aqiTextView = (TextView)findViewById(R.id.aqiTextView);
        iaqiTextView = (TextView)findViewById(R.id.iaqiTextView);
        stationTextView = (TextView)findViewById(R.id.stationTextView);
    }

    public void goCity(View view) {
        DownloadTask task = new DownloadTask();
        task.execute("https://api.waqi.info/feed/" + cityEditText.getText().toString() + "/?token=dd0258efb622424391f48f09ae13bbfe8c0f1495");
    }

    public class DownloadTask extends AsyncTask<String,Void,String> {
        @Override
        protected String doInBackground(String... urls) {
            String result = "";
            URL url;
            HttpURLConnection urlConnection = null;
            try {
                url = new URL(urls[0]);
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
                String status = jsonObject.getString("status");
                if(status.equals("ok")) {
                    String data = jsonObject.getString("data");
                    JSONObject jsonObject1 = new JSONObject(data);
                    String city = jsonObject1.getString("city");
                    JSONObject jsonObject2 = new JSONObject(city);
                    String name = jsonObject2.getString("name");
                    cityTextView.setText(cityEditText.getText().toString().toUpperCase());
                    stationTextView.setText("Station : " + name);
                    JSONObject jsonObject3 = new JSONObject(data);
                    String aqi = jsonObject3.getString("aqi");
                    double aqiNum = Double.parseDouble(aqi);
                    String aqiString = "";
                    if(aqiNum<=50)
                        aqiString = aqi + "\nGood";
                    else if(aqiNum>50 && aqiNum<=100)
                        aqiString = aqi + "\nModerate";
                    else if(aqiNum>100 && aqiNum<=150)
                        aqiString = aqi + "\nUnhealthy for Sensitive Groups";
                    else if(aqiNum>150 && aqiNum<=200)
                        aqiString = aqi + "\nUnhealthy";
                    else if(aqiNum>200 && aqiNum<=300)
                        aqiString = aqi + "\nVery Unhealthy";
                    else
                        aqiString = aqi + "\nHazardous";
                    aqiTextView.setText(aqiString);
                    String iaqi = jsonObject3.getString("iaqi");
                    JSONObject jsonObject4 = new JSONObject(iaqi);
                    String pm25 = null;
                    String vpm25;
                    try {
                        pm25 = jsonObject4.getString("pm25");
                        JSONObject jsonObject5 = new JSONObject(pm25);
                        vpm25 = jsonObject5.getString("v");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        vpm25 = "0.0";
                    }
                    String pm10 = null;
                    String vpm10;
                    try {
                        pm10 = jsonObject4.getString("pm10");
                        JSONObject jsonObject6 = new JSONObject(pm10);
                        vpm10 = jsonObject6.getString("v");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        vpm10 = "0.0";
                    }
                    String so2 = null;
                    String vso2;
                    try {
                        so2 = jsonObject4.getString("so2");
                        JSONObject jsonObject7 = new JSONObject(so2);
                        vso2 = jsonObject7.getString("v");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        vso2 = "0.0";
                    }
                    String co = null;
                    String vco;
                    try {
                        co = jsonObject4.getString("co");
                        JSONObject jsonObject8 = new JSONObject(co);
                        vco = jsonObject8.getString("v");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        vco = "0.0";
                    }
                    String no2 = null;
                    String vno2;
                    try {
                        no2 = jsonObject4.getString("no2");
                        JSONObject jsonObject9 = new JSONObject(no2);
                        vno2 = jsonObject9.getString("v");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        vno2 = "0.0";
                    }
                    String o3 = null;
                    String vo3;
                    try {
                        o3 = jsonObject4.getString("o3");
                        JSONObject jsonObject10 = new JSONObject(o3);
                        vo3 = jsonObject10.getString("v");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        vo3 = "0.0";
                    }
                    iaqiTextView.setText("Individual Pollutants\nCO : " + vco + "\nNO2 : " + vno2 + "\nO3 : " + vo3 + "\nPM10 : " + vpm10 + "\nPM2.5 : " + vpm25 + "\nSO2 : " + vso2);

                    cityTextView.animate().alpha(1).setDuration(2000);
                    aqiTextView.animate().alpha(1).setDuration(2000);
                    iaqiTextView.animate().alpha(1).setDuration(2000);
                    stationTextView.animate().alpha(1).setDuration(2000);

                }
                else if(status.equals("error")) {
                    String data = jsonObject.getString("data");
                    Toast.makeText(CityInformationActivity.this, data, Toast.LENGTH_SHORT).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
