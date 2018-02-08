package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by Henri Pirinen on 1/29/2018.
 */

public class FragmentProfile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_profile, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*view.findViewById(R.id.btnApply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

        GraphView graph = (GraphView) view.findViewById(R.id.graph);
        DataPoint[] points = new DataPoint[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new DataPoint(i, 100-i*(Math.random()*1));
        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(points);

        // set manual X bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(150);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(4);
        graph.getViewport().setMaxX(80);

        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);

        graph.addSeries(series);

        GraphView graphActivity = (GraphView) view.findViewById(R.id.activity);
        DataPoint[] activityPoints = new DataPoint[60];
        for (int i = 0; i < activityPoints.length; i++){
            activityPoints[i] = new DataPoint(i, Math.random()*8);
        }
        BarGraphSeries<DataPoint> values = new BarGraphSeries<>(activityPoints);

        graphActivity.getViewport().setYAxisBoundsManual(true);
        graphActivity.getViewport().setMinY(0);
        graphActivity.getViewport().setMaxY(8);

        graphActivity.getViewport().setXAxisBoundsManual(true);
        graphActivity.getViewport().setMinX(0);
        graphActivity.getViewport().setMaxX(31);

        // enable scaling and scrolling
        graphActivity.getViewport().setScalable(true);
        graphActivity.getViewport().setScalableY(true);

        values.setSpacing(25);
        graphActivity.addSeries(values);
    }
}
