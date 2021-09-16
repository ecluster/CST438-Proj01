package com.example.cst438proj01;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;


import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    List<Job> jobList;
    Context context;
    private JobSearch search;

    public JobAdapter(Context context, List<Job> jobList){
        this.context = context;
        this.jobList = jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(JobAdapter.ViewHolder holder, int position) {
        holder.tvJobName.setText(jobList.get(position).getPositionTitle(0).toString());
    }

    @Override
    public int getItemCount() {
        if(jobList != null){
            return jobList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJobName;

        public ViewHolder(View itemView) {
            super(itemView);
            tvJobName = (TextView)itemView.findViewById(R.id.tvResult);
        }
    }

}
















