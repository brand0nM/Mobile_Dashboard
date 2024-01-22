package org.androidprojects.uibasics;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        TextView txtWelcome = findViewById(R.id.addText);
        TextView button = findViewById(R.id.button);
        button.setText("clicked");
        txtWelcome.setText("Hello");

    }
}