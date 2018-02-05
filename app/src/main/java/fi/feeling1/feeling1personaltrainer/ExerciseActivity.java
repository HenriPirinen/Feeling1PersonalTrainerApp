package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Henri Pirinen on 2/3/2018.
 */

public class ExerciseActivity extends AppCompatActivity{
    TextView exerciseTxt;
    String content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        exerciseTxt = findViewById(R.id.exerciseTxt);
        content = getIntent().getStringExtra("content");

        getSupportActionBar().setTitle(content);

        if(content.equals("Harjoitus 1")) {
            exerciseTxt.setText(getString(R.string.exercise_0));
        } else if(content.equals("Harjoitus 2")) {
            exerciseTxt.setText(getString(R.string.exercise_1));
        } else {
            exerciseTxt.setText(getString(R.string.exercise_1));
        }
    }
}
