package com.example.speech_to_text;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    //teszt commit
    private ImageView microphoneButton;
    private TextView textView;

    private static final int REQUEST_CODE_SPEECH_INPUT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        microphoneButton = findViewById(R.id.iv_mic);
        textView = findViewById(R.id.tv_speech_to_text);

        microphoneButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            intent.putExtra(
                    RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                    RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,
                    Locale.getDefault());

            intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                    "Speak to text");

            try {
                startActivityForResult(
                        intent, REQUEST_CODE_SPEECH_INPUT);
            }
            catch (Exception e) {
                Toast
                        .makeText(MainActivity.this,
                                " " + e.getMessage(),
                                Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }

    @Override
    @Deprecated
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_SPEECH_INPUT) {
            if (resultCode == RESULT_OK && data != null) {
                ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                if (result != null && !result.isEmpty()) {
                    textView.setText(Objects.requireNonNull(result.get(0)));
                }
            }
        }

    }
}