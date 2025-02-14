package com.org.fiiactiv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);

        // Find the "Go Back" button in the layout
        Button goBackButton = findViewById(R.id.btn_go_back);

        // Set an OnClickListener for the button
        goBackButton.setOnClickListener(view -> {
            // Create an Intent to navigate back to MainActivity
            Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }

}
