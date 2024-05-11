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

import org.w3c.dom.Text;

public class OrangeActivity extends AppCompatActivity {
    Button btnRegresarOrange;
    TextView txtDataOrange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orange);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnRegresarOrange = findViewById(R.id.btnRegresarOrange);
        btnRegresarOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(OrangeActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });

        Bundle extras = getIntent().getExtras();
        String txt =  (String)extras.get("DATA_FRASES_CELEBRES");

        txtDataOrange = findViewById(R.id.txtDataOrange);
        txtDataOrange.setText(txt);
    }
}