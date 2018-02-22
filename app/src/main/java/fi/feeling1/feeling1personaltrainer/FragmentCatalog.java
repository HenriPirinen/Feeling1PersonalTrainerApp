package fi.feeling1.feeling1personaltrainer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by it15 on 6.2.2018.
 */

public class FragmentCatalog extends Fragment{

    public Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_catalog, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getContext();
        GridView gridview = (GridView) view.findViewById(R.id.gridView);

        List<ItemObject> allItems = getAllItemObject();
        GridAdapter gridadapter = new GridAdapter(context, allItems);
        gridview.setAdapter(gridadapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        bundle.putString("condition", "chest");
                        fragment = new Fragment_exercise();
                        break;
                    case 1:
                        bundle.putString("condition", "back");
                        fragment = new Fragment_exercise();
                        break;
                    case 2:
                        bundle.putString("condition", "legs");
                        fragment = new Fragment_exercise();
                        break;
                    case 3:
                        bundle.putString("condition", "biceps");
                        fragment = new Fragment_exercise();
                        break;
                    case 4:
                        bundle.putString("condition", "triceps");
                        fragment = new Fragment_exercise();
                        break;
                    case 5:
                        bundle.putString("condition", "shoulders");
                        fragment = new Fragment_exercise();
                        break;
                    case 6:
                        bundle.putString("condition", "abdominals");
                        fragment = new Fragment_exercise();
                        break;
                    case 7:
                        bundle.putString("condition", "forearms");
                        fragment = new Fragment_exercise();
                        break;
                    case 8:
                        bundle.putString("condition", "glutes");
                        fragment = new Fragment_exercise();
                        break;
                }
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentArea, fragment, "tag");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    private List<ItemObject> getAllItemObject(){
        ItemObject itemObject = null;
        List<ItemObject> items = new ArrayList<>();
        items.add(new ItemObject("Rinta", "one"));
        items.add(new ItemObject("Selkä", "one"));
        items.add(new ItemObject("Jalat", "one"));
        items.add(new ItemObject("Hauis", "one"));
        items.add(new ItemObject("Ojentaja", "one"));
        items.add(new ItemObject("Olkapää", "one"));
        items.add(new ItemObject("Vatsa", "one"));
        items.add(new ItemObject("Kyynärvarret", "one"));
        items.add(new ItemObject("Pakarat", "one"));
        return items;
    }
}
