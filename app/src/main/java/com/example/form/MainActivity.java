package com.example.form;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextCPR, editTextFirstName, editTextLastName, editTextEmail;
    RadioGroup radioGroupGender, radioGroupDiplomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText fields
        editTextCPR = findViewById(R.id.editTextCPR);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);

        // Initialize RadioGroup fields
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioGroupDiplomas = findViewById(R.id.radioGroupDiplomas);
    }

    public void onSubmit(View view) {
        // Validate form fields
        if (TextUtils.isEmpty(editTextCPR.getText()) ||
                TextUtils.isEmpty(editTextFirstName.getText()) ||
                TextUtils.isEmpty(editTextLastName.getText()) ||
                TextUtils.isEmpty(editTextEmail.getText()) ||
                radioGroupGender.getCheckedRadioButtonId() == -1 ||
                radioGroupDiplomas.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "Form submitted successfully", Toast.LENGTH_SHORT).show();
        }
    }

    public void onReset(View view) {
        // Clear all form fields
        editTextCPR.getText().clear();
        editTextFirstName.getText().clear();
        editTextLastName.getText().clear();
        editTextEmail.getText().clear();
        radioGroupGender.clearCheck();
        radioGroupDiplomas.clearCheck();
    }
}
