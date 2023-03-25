/*
 * Lasse Tuominen
 * 470627
 * 25.03.2023
 *
 * */
package com.example.week9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AvatarSpinnerAdapter extends ArrayAdapter<Integer> {

    private Context mContext;
    private ArrayList<Integer> mAvatarList;

    public AvatarSpinnerAdapter(Context context, ArrayList<Integer> avatarList) {
        super(context, R.layout.avatar_spinner_item, avatarList);
        this.mContext = context;
        this.mAvatarList = avatarList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.avatar_spinner_item, parent, false);

        ImageView imageView = row.findViewById(R.id.avatarImageView);
        imageView.setImageResource(mAvatarList.get(position));

        return row;
    }



    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(position, convertView, parent);
    }
}

