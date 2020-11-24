package com.example.mateuszwarychaplikacjazaliczeniowa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView haslo;
    Button guzik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        haslo = (TextView)findViewById(R.id.haslo);
        guzik = (Button)findViewById(R.id.guzik);

        guzik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                haslo.setText(generateSting(16));

            }
        });
    }

    private String generateSting(int length){
        char[] chars = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890".toCharArray();
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<length; i++)
        {
         char c = chars[random.nextInt(chars.length)];
         stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

// Mateusz Warych grupa PAC2
// Program tworzy hasło z losowych znaków po klinięciu w przycisk