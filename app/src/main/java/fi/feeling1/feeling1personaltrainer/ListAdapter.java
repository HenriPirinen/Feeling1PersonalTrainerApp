package fi.feeling1.feeling1personaltrainer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Henri Pirinen on 1/30/2018.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

        private List<ListData> exerciseList;
        private String condition;
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

        public ListAdapter(List<ListData> exerciseList, String CONDITION) {
            this.exerciseList = exerciseList;
            condition = CONDITION;
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

                switch (condition) {
                    case "exercises":
                        intent = new Intent(context, ExerciseActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Perusohjelma aloittelijalle");
                                break;
                            case 1:
                                intent.putExtra("content","Alavartalon kuntosaliohjelma");
                                break;
                            default:
                                intent.putExtra("content","Harjoitus 0");
                                break;
                        }
                        break;
                    case "chest":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "back":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "legs":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "biceps":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "triceps":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "shoulders":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "abdominals":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "forearms":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
                        break;
                    case "glutes":
                        intent = new Intent(context, EquipmentActivity.class);
                        switch (holder.getAdapterPosition())
                        {
                            case 0:
                                intent.putExtra("content","Smith-laite");
                                break;
                            case 1:
                                intent.putExtra("content","Smith-laite");
                                break;
                            default:
                                intent.putExtra("content","Smith-laite");
                                break;
                        }
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
