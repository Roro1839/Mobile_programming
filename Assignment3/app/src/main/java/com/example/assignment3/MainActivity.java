package com.example.assignment3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText unitPriceEditText, quantityEditText;
    private Button calculateButton;
    private TextView totalPriceTextView, grandTotalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unitPriceEditText = findViewById(R.id.unit_price_edit_text);
        quantityEditText = findViewById(R.id.quantity_edit_text);
        calculateButton = findViewById(R.id.calculate_button);
        totalPriceTextView = findViewById(R.id.total_price_text_view);
        grandTotalTextView = findViewById(R.id.grand_total_text_view);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unitPriceString = unitPriceEditText.getText().toString();
                String quantityString = quantityEditText.getText().toString();

                if (!unitPriceString.isEmpty() && !quantityString.isEmpty()) {
                    double unitPrice = Double.parseDouble(unitPriceString);
                    int quantity = Integer.parseInt(quantityString);

                    double totalPrice = unitPrice * quantity;
                    totalPriceTextView.setText(String.valueOf(totalPrice));

                    // Assuming grand total is simply the total price for now
                    grandTotalTextView.setText(String.valueOf(totalPrice));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}