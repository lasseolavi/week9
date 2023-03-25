/*
 * Lasse Tuominen
 * 470627
 * 25.03.2023
 *
 * */
package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage userStorage = UserStorage.getInstance();
    }
    public void switchToUser(View view){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
    public void switchToUserStorage(View view){
        Intent intent = new Intent(this, UserStorageActivity.class);
        startActivity(intent);
    }
}