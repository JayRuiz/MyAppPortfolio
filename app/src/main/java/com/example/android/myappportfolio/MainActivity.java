package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMovieClicked(View view){
        toastMessage(getString(R.string.movie_button).toUpperCase());
    }

    public void onHawkClicked(View view) {
        toastMessage(getString(R.string.hawk_button).toUpperCase());
    }

    public void onBiggerClicked(View view){
        toastMessage(getString(R.string.bigger_button).toUpperCase());
    }

    public void onMaterialClicked(View view){
        toastMessage(getString(R.string.material_button).toUpperCase());
    }

    public void onUbiquitousClicked(View view){
        toastMessage(getString(R.string.ubiquitous_button).toUpperCase());
    }

    public void onCapstoneClicked(View view){
        toastMessage(getString(R.string.capstone_button).toUpperCase());
    }

    private void toastMessage(String appName) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_message) + " "+appName+ " "+getString(R.string.toast_ending);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
