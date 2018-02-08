package fi.feeling1.feeling1personaltrainer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

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
