package com.vue.test.service;

import com.vue.test.domen.User;

import java.util.List;

public interface UserService {


    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserByName(String name);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

    User create (String name, String fullname );
}


