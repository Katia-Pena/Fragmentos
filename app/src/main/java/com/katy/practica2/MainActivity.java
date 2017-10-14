package com.katy.practica2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //showFragmentA();
        showFragmentB();

    }
        private void showFragmentA(){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_a,new AFragment()).commit();

        }
    private void showFragmentB(){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_b,new BFragment()).commit();

    }

}
