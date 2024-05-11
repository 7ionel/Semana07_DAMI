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

public class BlueActivity extends AppCompatActivity {

   Button btnRegresarBlue;
   TextView txtDataBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blue);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnRegresarBlue = findViewById(R.id.btnRegresarBlue);
        btnRegresarBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(BlueActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        Bundle extras = getIntent().getExtras();
        String txt =  (String)extras.get("DATA_FRASES_CELEBRES");

        txtDataBlue = findViewById(R.id.txtDataBlue);
        txtDataBlue.setText(txt);

    }
}