package com.simcoder.tinder.Matches;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.simcoder.tinder.R;

import java.util.List;

/**
 * Created by manel on 10/31/2017.
 */

public class EventsGroupAdapter extends RecyclerView.Adapter<EventsGroupViewHolders>{
    private List<EventsGroupObject> EventsList;
    private Context context;


    public EventsGroupAdapter(List<EventsGroupObject> EvrntssList, Context context){
        this.EventsList = EvrntssList;
        this.context = context;
    }

    @Override
    public EventsGroupViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matches, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        EventsGroupViewHolders rcv = new EventsGroupViewHolders(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(EventsGroupViewHolders holder, int position) {
        holder.mEventId.setText(EventsList.get(position).getUserId());
        holder.mEventName.setText(EventsList.get(position).getName());
        if(!EventsList.get(position).getProfileImageUrl().equals("default")){
            Glide.with(context).load(EventsList.get(position).getProfileImageUrl()).into(holder.mEventImage);
        }
    }

    @Override
    public int getItemCount() {
        return this.EventsList.size();
    }
}
