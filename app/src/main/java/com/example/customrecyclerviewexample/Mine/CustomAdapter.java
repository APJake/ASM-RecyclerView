package com.example.customrecyclerviewexample.Mine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.customrecyclerviewexample.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<MyPost> posts;

    public CustomAdapter(ArrayList<MyPost> posts){
        this.posts=posts;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View listItem=inflater.inflate(R.layout.custom_recycler_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        MyPost post=posts.get(position);
        holder.tvName.setText(post.getName());
        holder.tvPostCaption.setText(post.getCaption());
        holder.imgIcon.setImageResource(post.getIcon());
        holder.tvDate.setText(post.getTime());
        if(post.getImage()==-1){
            holder.imgPostImage.setVisibility(View.GONE);
        }else{
            holder.imgPostImage.setImageResource(post.getImage());
        }
        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Like "+post.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Share "+post.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Comment "+post.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgPostImage;
        public ImageView imgIcon;
        public TextView tvPostCaption, tvName, tvDate;
        public Button btnLike, btnComment, btnShare;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgIcon=itemView.findViewById(R.id.img_profile_icon);
            this.imgPostImage=itemView.findViewById(R.id.img_post_photo);
            this.tvPostCaption=itemView.findViewById(R.id.tv_post_caption);
            this.tvName=itemView.findViewById(R.id.tv_profile_name);
            this.tvDate=itemView.findViewById(R.id.tv_profile_time);
            this.btnLike=itemView.findViewById(R.id.btn_post_like);
            this.btnComment=itemView.findViewById(R.id.btn_post_comment);
            this.btnShare=itemView.findViewById(R.id.btn_post_share);
        }
    }
}
