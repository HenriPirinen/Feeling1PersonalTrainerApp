package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Henri Pirinen on 2/5/2018.
 */

public class EquipmentActivity extends AppCompatActivity {

    TextView desc;
    String content;

    //https://www.loopwiki.com/application/embed-youtube-video-in-android-app/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_equipment);

        desc = findViewById(R.id.equipmentDesc);
        content = getIntent().getStringExtra("content");
        getSupportActionBar().setTitle(content);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        switch (content) {
            case "Smith-laite":
                desc.setText(getString(R.string.smith_description));
                break;
            case "Soutulaite":
                desc.setText(getString(R.string.soutulaite_description));
                break;
            default:
                desc.setText(getString(R.string.smith_description));
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
