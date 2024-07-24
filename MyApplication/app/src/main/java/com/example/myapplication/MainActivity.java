package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNum1, editTextNum2, editTextNum3;
    private TextView textViewMax, textViewMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        editTextNum3 = findViewById(R.id.editTextNum3);
        textViewMax = findViewById(R.id.textViewMax);
        textViewMin = findViewById(R.id.textViewMin);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editTextNum1.getText().toString());
                int num2 = Integer.parseInt(editTextNum2.getText().toString());
                int num3 = Integer.parseInt(editTextNum3.getText().toString());

                int max = Math.max(num1, Math.max(num2, num3));
                int min = Math.min(num1, Math.min(num2, num3));

                textViewMax.setText("Maximum: " + max);
                textViewMin.setText("Minimum: " + min);
            }
        });
    }
}

