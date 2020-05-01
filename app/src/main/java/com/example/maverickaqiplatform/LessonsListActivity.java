package com.example.maverickaqiplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LessonsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_list);

        ListView lessonsListView = (ListView)findViewById(R.id.lessonsListView);
        ArrayList<String> lessonTitles = new ArrayList<String>();
        final ArrayList<String> lessonUrls = new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lessonTitles);
        lessonTitles.add("Air quality index : Wikipedia");
        lessonUrls.add("https://en.wikipedia.org/wiki/Air_quality_index");
        lessonTitles.add("What is Air Quality Index?");
        lessonUrls.add("https://www.conserve-energy-future.com/air-quality-index.php");
        lessonTitles.add("What is Air Quality Index and how is it calculated?");
        lessonUrls.add("https://www.jagranjosh.com/general-knowledge/what-is-air-quality-index-1573026691-1");
        lessonTitles.add("Air Quality Index");
        lessonUrls.add("https://www.weather.gov/safety/airquality-aqindex");
        lessonTitles.add("WHAT IS AIR QUALITY INDEX (AQI)");
        lessonUrls.add("https://www.business-standard.com/about/what-is-air-quality-index");
        lessonTitles.add("Air Quality Index");
        lessonUrls.add("https://www.lung.org/clean-air/outdoors/air-quality-index");
        lessonTitles.add("How to Read Air Quality Index (AQI) And Determine If It’s Safe To Go Outside");
        lessonUrls.add("https://www.scusd.edu/e-connections-post/how-read-air-quality-index-aqi-and-determine-if-its-safe-go-outside");
        lessonTitles.add("Air Quality Index Color Code Guide");
        lessonUrls.add("https://webcam.srs.fs.fed.us/test/AQI.shtml");
        lessonTitles.add("How Is Air Quality Measured?");
        lessonUrls.add("https://scijinks.gov/air-quality/");
        lessonTitles.add("What is AQI? : Guide to understanding the Air Quality Index");
        lessonUrls.add("https://support.airvisual.com/en/articles/3029425-what-is-aqi");
        lessonTitles.add("Air Quality Index: Definition & Uses");
        lessonUrls.add("https://study.com/academy/lesson/air-quality-index-definition-uses.html");
        lessonTitles.add("Air Quality Index Scale and Color Legend");
        lessonUrls.add("https://aqicn.org/scale/");
        lessonTitles.add("Carbon monoxide in the air");
        lessonUrls.add("https://www.epa.vic.gov.au/for-community/environmental-information/air-quality/carbon-monoxide-in-the-air");
        lessonTitles.add("Nitrogen dioxide in the air");
        lessonUrls.add("https://www.epa.vic.gov.au/for-community/environmental-information/air-quality/nitrogen-dioxide-in-the-air");
        lessonTitles.add("Ozone in the air");
        lessonUrls.add("https://www.epa.vic.gov.au/for-community/environmental-information/air-quality/ozone-in-the-air");
        lessonTitles.add("PM10 particles in the air");
        lessonUrls.add("https://www.epa.vic.gov.au/for-community/environmental-information/air-quality/pm10-particles-in-the-air");
        lessonTitles.add("PM2.5 particles in the air");
        lessonUrls.add("https://www.epa.vic.gov.au/for-community/environmental-information/air-quality/pm25-particles-in-the-air");
        lessonTitles.add("Sulfur dioxide in the air");
        lessonUrls.add("https://www.epa.vic.gov.au/for-community/environmental-information/air-quality/sulfur-dioxide-in-the-air");


        lessonsListView.setAdapter(arrayAdapter);
        lessonsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), LessonActivity.class);
                intent.putExtra("url", lessonUrls.get(position));
                startActivity(intent);
            }
        });
    }
}
