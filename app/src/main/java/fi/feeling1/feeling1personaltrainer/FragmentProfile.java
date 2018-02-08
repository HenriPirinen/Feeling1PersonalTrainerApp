package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
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
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 70),
                new DataPoint(1, 68),
                new DataPoint(2, 66),
                new DataPoint(3, 64),
                new DataPoint(4, 68),
                new DataPoint(5, 66),
                new DataPoint(6, 64),
                new DataPoint(7, 68),
                new DataPoint(8, 66)
        });
        graph.addSeries(series);

        GraphView graphActivity = (GraphView) view.findViewById(R.id.activity);
        LineGraphSeries<DataPoint> values = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 2),
                new DataPoint(1, 0),
                new DataPoint(2, 0),
                new DataPoint(3, 3),
                new DataPoint(4, 1),
                new DataPoint(5, 0),
                new DataPoint(6, 0),
                new DataPoint(7, 0),
                new DataPoint(8, 2)
        });
        graphActivity.addSeries(values);

    }
}
