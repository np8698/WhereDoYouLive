package com.example.wheredoyoulive;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter {

    private Activity context;
    private List<Property> lName;

    public ListAdapter(Activity context, List<Property> lName){
        super(context, R.layout.activity_home_list, lName);
        this.context = context;
        this.lName = lName;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.activity_home_list, null, true);

        TextView tvName = listViewItem.findViewById(R.id.tvName);
        TextView tvAddress = listViewItem.findViewById(R.id.tvAddress);
        TextView tvDescp = listViewItem.findViewById(R.id.tvDescp);
        TextView tvBeds = listViewItem.findViewById(R.id.tvBeds);
        TextView tvBathrooms = listViewItem.findViewById(R.id.tvBathroom);
        TextView tvSqFt = listViewItem.findViewById(R.id.tvSqFt);
        TextView tvPropStatus = listViewItem.findViewById(R.id.tvPropStatus);

        Property property = lName.get(position);

        tvName.setText(property.getsName());
        tvAddress.setText(property.getsAddress());
        tvDescp.setText(property.getsDescription());
        tvBeds.setText(property.getsBeds());
        tvBathrooms.setText(property.getsBathrooms());
        tvSqFt.setText(property.getsSqrFoot());
        tvPropStatus.setText(property.getsPropertyType());

        return listViewItem;
    }
}
