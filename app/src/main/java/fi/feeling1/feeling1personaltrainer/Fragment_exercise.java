package fi.feeling1.feeling1personaltrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by it15 on 30.1.2018.
 */

public class Fragment_exercise extends Fragment {

    private List<ListData> exerciseList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ListAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exercise, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewList);
        mAdapter = new ListAdapter(exerciseList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareExerciseList();
    }

    public void prepareExerciseList()
    {
        ListData item = new ListData("Harjoitus 1", "Kuvaus 1");
        exerciseList.add(item);
        item = new ListData("Harjoitus 2", "Kuvaus 2");
        exerciseList.add(item);
        item = new ListData("Harjoitus 3", "Kuvaus 3");
        exerciseList.add(item);
        item = new ListData("Harjoitus 4", "Kuvaus 4");
        exerciseList.add(item);
        item = new ListData("Harjoitus 5", "Kuvaus 5");
        exerciseList.add(item);
        item = new ListData("Harjoitus 6", "Kuvaus 6");
        exerciseList.add(item);
        item = new ListData("Harjoitus 7", "Kuvaus 7");
        exerciseList.add(item);
        item = new ListData("Harjoitus 8", "Kuvaus 8");
        exerciseList.add(item);
        item = new ListData("Harjoitus 9", "Kuvaus 9");
        exerciseList.add(item);
        item = new ListData("Harjoitus 10", "Kuvaus 10");
        exerciseList.add(item);
        item = new ListData("Harjoitus 11", "Kuvaus 11");
        exerciseList.add(item);

        mAdapter.notifyDataSetChanged();
    }
}
