package com.simcoder.tinder.Matches;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.simcoder.tinder.R;

import java.util.List;


public class EventGroupAdapter extends RecyclerView.Adapter<EventGroupViewHolders> {
    private List<EventGroupObject> matchesList;
    private Context context;


    public EventGroupAdapter(List<EventGroupObject> matchesList, Context context){
        this.matchesList = matchesList;
        this.context = context;
    }

    @Override
    public EventGroupViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matches, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        EventGroupViewHolders rcv = new EventGroupViewHolders(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(EventGroupViewHolders holder, int position) {
        holder.mMatchId.setText("");
        holder.mMatchName.setText(matchesList.get(position).getName());
        if(!matchesList.get(position).getProfileImageUrl().equals("default")){
            Glide.with(context).load(matchesList.get(position).getProfileImageUrl()).into(holder.mMatchImage);
        }
    }

    @Override
    public int getItemCount() {
        return this.matchesList.size();
    }
}
