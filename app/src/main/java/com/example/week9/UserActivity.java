package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {
    private EditText firstNameET;
    private EditText lastNameET;
    private EditText emailET;
    private RadioGroup studyChoiceRG;
    private Button addUser;
    private Spinner avatarSpinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        firstNameET = findViewById(R.id.etunimiText);
        lastNameET = findViewById(R.id.sukunimiText);
        emailET = findViewById(R.id.SahkopostiText);
        studyChoiceRG = findViewById(R.id.rgUser);
        addUser = findViewById(R.id.addUserButton);

        Spinner avatarSpinner = findViewById(R.id.avatarSpinner);
        ArrayList<Integer> avatarList = new ArrayList<>();
        avatarList.add(R.drawable.avatar1);
        avatarList.add(R.drawable.avatar2);
        avatarList.add(R.drawable.avatar3);
        AvatarAdapter adapter = new AvatarAdapter(this, avatarList);
        avatarSpinner.setAdapter(adapter);



    }
    public void addUser(View view) {
        RadioGroup rgUser = findViewById(R.id.rgUser);
        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();
        String email = emailET.getText().toString();
        int studyID = studyChoiceRG.getCheckedRadioButtonId();
        avatarSpinner = findViewById(R.id.avatarSpinner);
        int selectedAvatar = avatarSpinner.getSelectedItemPosition();
        String study = "";

        switch (studyID) {
            case R.id.lateButton:
                study = "Laskennallinen tekniikka";
                break;
            case R.id.sahkotekniikkaButton:
                study = "Sähkötekniikka";
                break;
            case R.id.tuotantotalousButton:
                study = "Tuotantotalous";
            case R.id.tietotekniikkaButton:
                study = "Tietotekniikka";
        }
        User user = new User(firstName,lastName,email,study, selectedAvatar);
        UserStorage us = UserStorage.getInstance();
        us.addUser(user);

    }



}