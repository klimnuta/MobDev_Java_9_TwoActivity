package com.example.twoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
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
}