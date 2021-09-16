package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList<>();
        list.add(new Post("Hello!", 12, new Date(2021, Calendar.OCTOBER,16)));
        list.add(new Post("I'm in the ghetto", 45, new Date()));
        list.add(new Post("Ra-ta-ta-taa", 239, new Date()));

        return list;
    }
}
