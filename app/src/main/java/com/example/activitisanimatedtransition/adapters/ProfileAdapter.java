package com.example.activitisanimatedtransition.adapters;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitisanimatedtransition.DetailActivity;
import com.example.activitisanimatedtransition.MainActivity;
import com.example.activitisanimatedtransition.R;
import com.example.activitisanimatedtransition.data.Profile;

import java.util.List;






public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    private final Context context;
    private Profile profile;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView name;
        public TextView bio;
        public int id;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.profile_image);
            name = itemView.findViewById(R.id.name);
            bio = itemView.findViewById(R.id.bio);
            id = View.generateViewId();
        }
    }

    private List<Profile> profilesList;

    public ProfileAdapter(Context context, List<Profile> profiles){
        this.context = context;
        profilesList = profiles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View profileView = inflater.inflate(R.layout.item, parent, false);
        profileView.setOnClickListener(new ItemClickedHandle());

        return new ViewHolder(profileView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        profile = profilesList.get(position);

        ImageView img = holder.image;
        img.setImageDrawable(context.getDrawable(profile.getImage()));
        img.setTag(profile.getImage());
        img.setTransitionName("img" + position);

        TextView nameView = holder.name;
        nameView.setText(profile.getName());
        nameView.setTransitionName("name" + position);
        TextView bio = holder.bio;
        bio.setText(profile.getBio());
        bio.setTransitionName("bio" + position);
    }

    @Override
    public int getItemCount() {
        return profilesList.size();
    }







    private class ItemClickedHandle implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent detailsIntent = new Intent(context, DetailActivity.class);

            ImageView img = v.findViewById(R.id.profile_image);
            TextView nameView = v.findViewById(R.id.name);
            TextView bio = v.findViewById(R.id.bio);

            int imageTag = (int) img.getTag();

            Profile p = new Profile();

            p.setImage(Integer.parseInt(String.valueOf(imageTag)));
            p.setName(nameView.getText().toString());
            p.setBio(bio.getText().toString());

            String position = img.getTransitionName().substring(3);

            detailsIntent.putExtra("profile", profileToArrayString(p, position));

            Pair[] transitions = new Pair[3];
            transitions[0] = new Pair<View, String>(img, img.getTransitionName());
            transitions[1] = new Pair<View, String>(nameView, nameView.getTransitionName());
            transitions[2] = new Pair<View, String>(bio, bio.getTransitionName());

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((MainActivity) context, transitions);

            context.startActivity(detailsIntent, options.toBundle());
        }

        private String [] profileToArrayString(Profile profile, String position){
            return new String [] { profile.getName(), profile.getBio(), String.valueOf(profile.getImage()), position};
        }
    }



}
