package com.rest.webservice.restfulwebservices.repository;

import com.rest.webservice.restfulwebservices.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
