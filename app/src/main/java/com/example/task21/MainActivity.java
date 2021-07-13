package com.example.task21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Mammal mammal1;
    Mammal mammal2;
    Gorilla gorilla;
    Button btnDisplay;
    Button batEnergy;
    Bat bat;
    TextView infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mammal1 = new Mammal();
        mammal2 = new Mammal();
        gorilla = new Gorilla(70);
        btnDisplay = findViewById(R.id.btnDisplay);
        batEnergy = findViewById(R.id.batEnergy);
        infoText = findViewById(R.id.infoText);
        bat = new Bat();
        btnDisplay.setOnClickListener(view -> {
            Toast.makeText(this, "energy Level Is " + mammal1.getEnergyLevel(), Toast.LENGTH_LONG).show();
        });
        batEnergy.setOnClickListener(v -> {
            bat.energyLevel();
        });
        infoText.setText("Bats energy after eating is : " + bat.eatHumans() + "Bats energy after attacking Town is : " + bat.attackTown() + "Bats energy after flying is : " + bat.fly());

    }


    public void throw_btn(View view) {
        Toast.makeText(this, "energy Level Is " + gorilla.throwSomething(), Toast.LENGTH_LONG).show();
    }


    public void climb_btn(View view) {
        Toast.makeText(this, "energy Level Is " + gorilla.climb(), Toast.LENGTH_LONG).show();
    }

    public void eat_btn(View view) {
        Toast.makeText(this, "energy Level Is " + gorilla.eatBananas(), Toast.LENGTH_LONG).show();
    }
}
