package com.example.customrecyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.customrecyclerviewexample.Mine.CustomAdapter;
import com.example.customrecyclerviewexample.Mine.MyPost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcyPosts;
    ArrayList<MyPost> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcyPosts=findViewById(R.id.rcy_posts);
        initData();
        CustomAdapter adapter=new CustomAdapter(posts);
        rcyPosts.setHasFixedSize(false);
        rcyPosts.setLayoutManager(new LinearLayoutManager(this));
        rcyPosts.setAdapter(adapter);
    }

    void initData(){
        posts=new ArrayList<>();


        posts.add(new MyPost(
                "Chan Myae Thu",
                R.drawable.girl1_round_icon,
                "3 min ago",
                "This is my first new post to GaceGook. Nice to meet you Guys. Have a grate day!",
                R.drawable.post1));


        posts.add(new MyPost(
                "Aung Minn Khant",
                R.drawable.cat1_round_icon,
                "2 hours ago",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
                        "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
                        "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo"));

        posts.add(new MyPost(
                "Daw Toke",
                R.drawable.woman1_round_icon,
                "1 hours ago",
                "My new car :3",
                R.drawable.post2));

        posts.add(new MyPost(
                "Hla Shwe",
                R.drawable.boy2_round_icon,
                "5 min ago",
                "Let's gooo",
                R.drawable.post3));

    }

}