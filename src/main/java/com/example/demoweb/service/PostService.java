package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        this.posts = new ArrayList<>();
        posts.add(new Post("Hello!", 12, new Date(2021, Calendar.OCTOBER,16)));
        posts.add(new Post("I'm in the ghetto", 45, new Date()));
        posts.add(new Post("Ra-ta-ta-taa", 239, new Date()));
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, 0, new Date()));
    }
}
