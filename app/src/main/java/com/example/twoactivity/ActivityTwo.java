package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    final String TAG = "States";

    TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvView = (TextView) findViewById(R.id.nad);

        Intent intent = getIntent();

        String Name = intent.getStringExtra("name");

        if (Name==null) {
            Name = "впишите его в 1 активити";
        }
        tvView.setText("Your name is: " + Name);

        Log.d(TAG, "ActivityTwo: onCreate()");
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    // обработка нажатий
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        //int id=item.getItemId();

        switch (item.getItemId()) {
            case R.id.menu_1:
                Intent intent1 = new Intent(this, MainActivity.class);
                //--------
                startActivity(intent1);
                return true;



            case R.id.menu_2:
                Intent intent = new Intent(this, ActivityTwo.class);
                //--------
                startActivity(intent);
                return true;


            // else return false;

            case R.id.menu_3:
                Intent intent3 = new Intent(this, ActivityThree.class);
                //--------
                startActivity(intent3);
                return true;


            case R.id.menu_4:
                Intent intent4 = new Intent(this, ActivityFour.class);
                //--------
                startActivity(intent4);
                return true;
                default:
                    return true;
        }
    }



    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTwo: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTwo: onDestroy()");
    }
}
