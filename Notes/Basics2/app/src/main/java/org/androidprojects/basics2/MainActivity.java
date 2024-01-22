package org.androidprojects.basics2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button button;
    private TextView text;
    private EditText textBox;

    // We can override the onClick method for all View objects
        // This includes not only Button
    @Override
    public void onClick(View view) {
        text = findViewById(R.id.mainText);
        textBox = findViewById(R.id.textBox);
        // Toast Message Instead for testing
        Toast.makeText(
                this,
                "Hiya "+textBox.getText().toString(),
                Toast.LENGTH_SHORT).show();
        // Check which button has been selected if ore than one
//        switch (view.getId()) {
//            case R.id.mainText:
//                text.setText("Like that");
//                break;
//            case R.id.mainButt:
//                text.setText("Wrong One");
//                break;
//            default:
//                break;
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Short Button Press
        button = findViewById(R.id.mainButt);
        button.setOnClickListener(this);

        // Set Long Button Press
        button.setOnLongClickListener (new View.OnLongClickListener() {
            // Or we can override a specific Button event
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Whya", Toast.LENGTH_LONG).show();
                text = findViewById(R.id.mainText);
                text.setText("Stahp Im already pressed");
                return true;
            }
        });
    }
}