package hu.unideb.mobil.mobil_tizenharmadik_ora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final String TORCH_KEY = BuildConfig.APPLICATION_ID + ".TORCH_KEY";
    static final String SHR_FILENAME = BuildConfig.APPLICATION_ID + ".SHR_FILENAME";
    private Button torchButton;
    private boolean torch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        torchButton = findViewById(R.id.torch_button_w);
    }



    public void torchMainAction(View view) {

    }
}