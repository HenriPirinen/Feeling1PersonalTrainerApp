package fi.feeling1.feeling1personaltrainer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Henri Pirinen on 1/30/2018.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

        private List<ListData> exerciseList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, desc;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title);
                desc = (TextView) view.findViewById(R.id.exercise_desc);
            }
        }

        public ListAdapter(List<ListData> exerciseList) {
            this.exerciseList = exerciseList;
        }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_exercises, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListData list = exerciseList.get(position);
        holder.title.setText(list.getTitle());
        holder.desc.setText(list.getDescription());
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

}
