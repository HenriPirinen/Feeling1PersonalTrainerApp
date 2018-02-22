package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Henri Pirinen on 2/3/2018.
 */

public class ExerciseActivity extends AppCompatActivity{
    TextView txtChapter_1;
    TextView txtChapter_2;
    TextView txtChapter_3;
    TextView txtChapter_4;
    TextView txtChapter_5;
    String content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        txtChapter_1 = findViewById(R.id.exerciseChapter_1);
        content = getIntent().getStringExtra("content");

        getSupportActionBar().setTitle(content);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        if(content.equals("Perusohjelma aloittelijalle")) {
            txtChapter_1.setText(getString(R.string.exercise_0));
        } else if(content.equals("Alavartalon kuntosaliohjelma")) {
            txtChapter_1.setText(getString(R.string.exercise_1));
        } else {
            txtChapter_1.setText(getString(R.string.exercise_1));
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
