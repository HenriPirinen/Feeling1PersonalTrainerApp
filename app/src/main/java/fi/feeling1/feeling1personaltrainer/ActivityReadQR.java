package fi.feeling1.feeling1personaltrainer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * Created by it15 on 7.2.2018.
 */

public class ActivityReadQR extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_qr);
        mScannerview = new ZXingScannerView(this);

        ActivityCompat.requestPermissions(ActivityReadQR.this, new String[]{Manifest.permission.CAMERA},1);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    setContentView(mScannerview);
                    mScannerview.setResultHandler(this);
                    mScannerview.startCamera();
                } else {
                    Toast.makeText(ActivityReadQR.this, "Permission denied", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mScannerview.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        String laiteID = result.getText();
        Intent intent;
        intent = new Intent(ActivityReadQR.this, EquipmentActivity.class);

        switch (laiteID) {
            case "laite1":
                intent.putExtra("content", "Smith-laite");
                break;

            case "laite2":
                intent.putExtra("content", "Soutulaite");
                break;
            default:
                intent.putExtra("content", "Smith-laite");
                break;
        }

        startActivity(intent);
        finish();
    }
}
