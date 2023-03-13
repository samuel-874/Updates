package com.javaMadeEasy.sammie.Updates.Repository;

import com.javaMadeEasy.sammie.Updates.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
