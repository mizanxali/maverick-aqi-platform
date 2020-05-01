package com.example.maverickaqiplatform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeTextView = (TextView)findViewById(R.id.welcomeTextView);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        TextView textView7 = (TextView)findViewById(R.id.textView7);

        welcomeTextView.animate().alpha(1).setDuration(2000);
        textView2.animate().alpha(1).setDuration(3000);
        textView4.animate().alpha(1).setDuration(4000);
        textView5.animate().alpha(1).setDuration(5000);
        textView6.animate().alpha(1).setDuration(6000);
        textView7.animate().alpha(1).setDuration(7000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.lessons) {
            Intent intent = new Intent(getApplicationContext(), LessonsListActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId() == R.id.articles) {
            Intent intent = new Intent(getApplicationContext(), ArticlesListActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId() == R.id.citydata) {
            Intent intent = new Intent(getApplicationContext(), CityInformationActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId() == R.id.mapdata) {
            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
