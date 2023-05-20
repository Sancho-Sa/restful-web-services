package com.rest.webservice.restfulwebservices.service;

import com.rest.webservice.restfulwebservices.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Swain", LocalDate.now().minusYears(62)));
        users.add(new User(++usersCount, "Beatrice", LocalDate.now().minusYears(29)));
        users.add(new User(++usersCount, "Ahri", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findUser(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveUser(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteUserById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
