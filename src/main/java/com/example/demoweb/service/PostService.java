package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList<Post>();
        list.add(new Post("Hello!", 12));
        list.add(new Post("I'm in the getto", 45));
        list.add(new Post("Ra-ta-ta-taa", 239));
        return list;
    }
}
