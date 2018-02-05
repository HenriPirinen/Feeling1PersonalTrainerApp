package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Henri Pirinen on 2/5/2018.
 */

public class EquipmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_equipment);
        //TODO: QR-koodista luetun arvon perusteella hae oikea teksti res/values/strings.xml tiedostosta, getString(R.string.txt_nimi)
    }
}
