package org.androidprojects.basics3;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckBox option1, option2, option3;
    private RadioGroup radioButton;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Checkbox Events
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(
                            MainActivity.this,
                            "You've Checked Option 1",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            "You've Unchecked Option 1",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Radio Buttons
        radioButton = findViewById(R.id.radioList);
        loading = findViewById(R.id.loading);
        radioButton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedInt) {
                // Cant Use Switch statement since id's aren't static
                if (checkedInt == R.id.radioOption1) {
                    Toast.makeText(MainActivity.this, "Option A ", Toast.LENGTH_LONG).show();

                } else if (checkedInt == R.id.radioOption2) {
                    Toast.makeText(MainActivity.this, "Option B ", Toast.LENGTH_LONG).show();
                    loading.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Option C ", Toast.LENGTH_LONG).show();
                    loading.setVisibility(View.GONE);
                }
            }
        });

    }
}