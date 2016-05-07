package com.myprojects.sampletimelineapp.UI.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myprojects.sampletimelineapp.R;
import com.myprojects.sampletimelineapp.UI.Model.Travel;

import java.util.List;

/**
 * Created by soniya on 07/05/16.
 */
public class RecyclerViewCustomAdapter extends RecyclerView.Adapter<RecyclerViewCustomAdapter.CustomViewHolder> {


    private List<Travel> travelList;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public CustomViewHolder(View view, int viewType) {
            super(view);
            //title = (TextView) view.findViewById(R.id.title);
            //genre = (TextView) view.findViewById(R.id.genre);
            //year = (TextView) view.findViewById(R.id.year);
        }
    }

    public RecyclerViewCustomAdapter(List<Travel> travelList) {
        this.travelList = travelList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (viewType == 0)
            view = inflater.inflate(R.layout.listview_custom_travel_row, parent, false);
        else if (viewType == 1)
            view = inflater.inflate(R.layout.listview_custom_event_row, parent, false);

        return new CustomViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return travelList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return 0;
        }else return 1;
        //return super.getItemViewType(position);
    }
}
