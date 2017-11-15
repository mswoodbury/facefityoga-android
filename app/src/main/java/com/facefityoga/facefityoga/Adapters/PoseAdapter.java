package com.facefityoga.facefityoga.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facefityoga.facefityoga.Models.Pose;
import com.facefityoga.facefityoga.R;

import java.util.List;

/**
 * Created by Greg on 11/11/2017.
 */

public class PoseAdapter extends RecyclerView.Adapter<PoseAdapter.PoseViewHolder> {

    private Context context;
    private List<Pose> poseList;

    public PoseAdapter(Context context, List<Pose> poseList) {
        this.context = context;
        this.poseList = poseList;
    }

    @Override
    public PoseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_left_path, parent, false);

        return new PoseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PoseViewHolder holder, int position) {
        final Pose pose = poseList.get(position);
        holder.title.setText(pose.getTitle());
        holder.favorite.setChecked(pose.getFavorite());

//        Glide.with(context)
//                .load(pose.getThumbnail())
//                .into(holder.thumbnail);

        holder.favorite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                pose.setFavorite(b);
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return poseList.size();
    }

    public class PoseViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;
        public CheckBox favorite;

        public PoseViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            favorite = itemView.findViewById(R.id.favorite);
        }
    }
}
