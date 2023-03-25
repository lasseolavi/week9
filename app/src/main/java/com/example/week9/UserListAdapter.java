/*
 * Lasse Tuominen
 * 470627
 * 25.03.2023
 *
 * */
package com.example.week9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();


    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.fullName.setText(users.get(position).getFullName());
        holder.email.setText(users.get(position).getEmail());
        holder.degreeProgram.setText(users.get(position).getDegreeProgram());
        switch (users.get(position).getImage()){
            case 0:
                holder.avatarView.setImageResource(R.drawable.avatar1);
                break;
            case 1:
                holder.avatarView.setImageResource(R.drawable.avatar2);
                break;
            case 2:
                holder.avatarView.setImageResource(R.drawable.avatar3);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
