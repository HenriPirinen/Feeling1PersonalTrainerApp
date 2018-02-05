package fi.feeling1.feeling1personaltrainer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Henri Pirinen on 1/30/2018.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

        private List<ListData> exerciseList;
        public Context context;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, desc;
            public RelativeLayout relativelayout;



            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title);
                desc = (TextView) view.findViewById(R.id.exercise_desc);
                relativelayout = (RelativeLayout) view.findViewById(R.id.relativeLayout);
                context = view.getContext();
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
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        ListData list = exerciseList.get(position);
        holder.title.setText(list.getTitle());
        holder.desc.setText(list.getDescription());
        holder.relativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(context, ExerciseActivity.class);
                switch (holder.getAdapterPosition())
                {
                    case 0:
                        intent.putExtra("content","Harjoitus 1");
                        break;
                    case 1:
                        intent.putExtra("content","Harjoitus 2");
                        break;
                    default:
                        intent.putExtra("content","Harjoitus 0");
                        break;
                }
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

}
