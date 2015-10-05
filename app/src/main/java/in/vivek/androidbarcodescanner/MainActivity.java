package in.vivek.androidbarcodescanner;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scan = (Button) findViewById(R.id.scanBtn);
        scan.setOnClickListener(this);
    }
    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

    @Override
    public void onClick(View v) {
       if(v.getId() == R.id.scanBtn) {
           Intent intent = new Intent(this, ScannerFragmentActivity.class);
           startActivity(intent);
       }
    }
}
