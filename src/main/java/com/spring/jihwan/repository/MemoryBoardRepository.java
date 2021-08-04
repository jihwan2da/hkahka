package com.spring.jihwan.repository;

import com.spring.jihwan.domain.Comment;
import com.spring.jihwan.domain.Post;

import java.util.ArrayList;

public class MemoryBoardRepository {
    private static ArrayList<Comment> comstore = new ArrayList<>();
    private static ArrayList<Post> poststore = new ArrayList<>();

    public void comstore(Comment comment) {
        comstore.add(comment);
    }

    public void poststore(Post post) {
        poststore.add(post);
    }
}
