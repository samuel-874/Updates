package com.javaMadeEasy.sammie.Updates.services;

import com.javaMadeEasy.sammie.Updates.Repository.PostRepository;
import com.javaMadeEasy.sammie.Updates.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;


    public List<Post> SeeAllPost() {
        return repository.findAll();
    }

    public void save(Post post) {
        repository.save(post);
    }

    public Post getPost(long  id){
        return repository.findById(id).get();
    }

    public void delete(long id) {
        repository.deleteById(id);
    }





}
