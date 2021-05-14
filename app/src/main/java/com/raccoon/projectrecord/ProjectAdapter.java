package com.raccoon.projectrecord;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.raccoon.projectrecord.R.layout.support_simple_spinner_dropdown_item;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private Project projects[];

    public ProjectAdapter(Project[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {

        return projects.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);
        return new ProjectViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);

    }



    static class ProjectViewHolder extends RecyclerView.ViewHolder{
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage=itemView.findViewById(R.id.project_logo);
            appTitle=itemView.findViewById(R.id.project_title);
            appDescription=itemView.findViewById(R.id.project_description);
        }

        public void bind(Project project)
        {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);

        }
    }

}
