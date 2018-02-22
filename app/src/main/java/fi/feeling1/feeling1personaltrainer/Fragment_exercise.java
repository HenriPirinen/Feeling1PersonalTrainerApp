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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by it15 on 30.1.2018.
 */

public class Fragment_exercise extends Fragment {

    private List<ListData> exerciseList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ListAdapter mAdapter;
    String condition;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        condition = getArguments().getString("condition");
        return inflater.inflate(R.layout.fragment_exercise, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewList);
        mAdapter = new ListAdapter(exerciseList, condition);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        prepareExerciseList();
        Toast.makeText(getContext(), condition, Toast.LENGTH_LONG).show();
    }

    public void prepareExerciseList()
    {
        ListData item;
        switch (condition) {
            case "exercises":
                item = new ListData("Peruskuntosaliohjelma", "Aloittelijalle, Kesto: X minuuttia");
                exerciseList.add(item);
                item = new ListData("Alavartalon kuntosaliohjelma", "Aloittelijalle, Kesto: X minuuttia");
                exerciseList.add(item);
                item = new ListData("Ylävartalon kuntosaliohjelma", "Aloittelijalle, Kesto: X minuuttia");
                exerciseList.add(item);
                item = new ListData("Ohjelma pakaraa ja vatsaa vahvistamaan", "Kesto: 2x vk");
                exerciseList.add(item);
                item = new ListData("Ohjelma rintaa ja käsivarsia vahvistamaan", "Kesto: 2x vk");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "chest":
                item = new ListData("Rintakehä", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Rintakehä", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Rintakehä", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Rintakehä", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Rintakehä", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "back":
                item = new ListData("Selkä", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Selkä", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Selkä", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Selkä", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Selkä", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "legs":
                item = new ListData("Jalat", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Jalat", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Jalat", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Jalat", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Jalat", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "biceps":
                item = new ListData("Hauis", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Hauis", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Hauis", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Hauis", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Hauis", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "triceps":
                item = new ListData("Ojentajat", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Ojentajat", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Ojentajat", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Ojentajat", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Ojentajat", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "shoulders":
                item = new ListData("Olkapäät", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Olkapäät", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Olkapäät", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Olkapäät", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Olkapäät", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "abdominals":
                item = new ListData("Vatsa", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Vatsa", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Vatsa", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Vatsa", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Vatsa", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "forearms":
                item = new ListData("Kyynärvarret", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Kyynärvarret", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Kyynärvarret", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Kyynärvarret", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Kyynärvarret", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
            case "glutes":
                item = new ListData("Pakarat", "Kuvaus 1");
                exerciseList.add(item);
                item = new ListData("Pakarat", "Kuvaus 2");
                exerciseList.add(item);
                item = new ListData("Pakarat", "Kuvaus 3");
                exerciseList.add(item);
                item = new ListData("Pakarat", "Kuvaus 4");
                exerciseList.add(item);
                item = new ListData("Pakarat", "Kuvaus 5");
                exerciseList.add(item);
                mAdapter.notifyDataSetChanged();
                break;
        }
    }
}
