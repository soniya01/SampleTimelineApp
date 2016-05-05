package com.myprojects.sampletimelineapp.UI.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.myprojects.sampletimelineapp.R;
import com.myprojects.sampletimelineapp.UI.Model.Travel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soniya on 05/05/16.
 */
public class CustomBaseAdapter extends BaseAdapter {
    private Context context;
    private List<Travel> travelList = new ArrayList<>();

    public CustomBaseAdapter(Context context, List<Travel> travelList) {
        this.context = context;
        this.travelList = travelList;
    }

    @Override
    public int getCount() {
        return travelList.size();
    }

    @Override
    public Object getItem(int position) {
        return travelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layoutView = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (position % 2 == 0) {
                layoutView = inflater.inflate(R.layout.listview_custom_travel_row, parent, false);
            }else{
                layoutView = inflater.inflate(R.layout.listview_custom_event_row, parent, false);
            }
        }

        return layoutView;
    }
}
