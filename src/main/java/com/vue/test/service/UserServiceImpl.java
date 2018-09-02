package com.vue.test.service;

import com.vue.test.domen.User;
import com.vue.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);

    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);


    }

    @Override
    public void deleteUserByName(String name) {
        userRepository.deleteUserByName(name);

    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();

    }

    @Override
    public boolean isUserExist(User user) {
        return userRepository.findByName(user.getName()) != null;
    }

    @Override
    public User create(String name, String fullname) {
        User user = User.builder()
                .name(name)
                .fullName(fullname)
                .build();
        return userRepository.save(user);
    }
}
