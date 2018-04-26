package com.simcoder.tinder.Matches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.simcoder.tinder.R;

/**
 * Created by manel on 10/31/2017.
 */

public class EventsGroupViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView mEventId, mEventName;
    public ImageView mEventImage;
    public EventsGroupViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        mEventId = (TextView) itemView.findViewById(R.id.Matchid);
        mEventName = (TextView) itemView.findViewById(R.id.MatchName);

        mEventImage = (ImageView) itemView.findViewById(R.id.MatchImage);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), EventGroupActivity.class);
        Bundle b = new Bundle();
        b.putString("matchId", mEventId.getText().toString());
        intent.putExtras(b);
        view.getContext().startActivity(intent);
    }

//    @Override
//    public void onClick(View view) {
//        Intent intent = new Intent(view.getContext(), ChatActivity.class);
//        Bundle b = new Bundle();
//        b.putString("matchId", mMatchId.getText().toString());
//        intent.putExtras(b);
//        view.getContext().startActivity(intent);
//    }
}
