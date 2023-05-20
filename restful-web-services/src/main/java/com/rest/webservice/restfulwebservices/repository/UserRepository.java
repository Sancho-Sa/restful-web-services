package com.rest.webservice.restfulwebservices.repository;

import com.rest.webservice.restfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
