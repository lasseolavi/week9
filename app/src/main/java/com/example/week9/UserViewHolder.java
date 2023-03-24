package com.example.week9;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView  avatarView;
    TextView fullName, email, degreeProgram;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        avatarView = itemView.findViewById(R.id.avatarView);
        fullName = itemView.findViewById(R.id.textFullName);
        email = itemView.findViewById(R.id.textEmail);
        degreeProgram = itemView.findViewById(R.id.textDegreeProgram);
    }
}
