package com.example.semana07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GreenActivity extends AppCompatActivity {

    Button btnRegresarGreen;
    TextView txtDataGreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_green);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnRegresarGreen = findViewById(R.id.btnRegresarGreen);
        btnRegresarGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(GreenActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        Bundle extras = getIntent().getExtras();
        String txt =  (String)extras.get("DATA_FRASES_CELEBRES");

        txtDataGreen = findViewById(R.id.txtDataGreen);
        txtDataGreen.setText(txt);
    }
}