package com.gfg.yogi.SpringBootBackendService.service;


import com.gfg.yogi.SpringBootBackendService.model.User;
import com.gfg.yogi.SpringBootBackendService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserDaoService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){

        return userRepository.findAll();
    }

    public User findUserById(Long id){
        return userRepository.findById(id).get();
    }

    public User createUser(User user){
        User createdUser = userRepository.save(user);
        return createdUser;
    }

    public User updateUser(User user){
        User updatedUser = userRepository.save(user);
        return updatedUser;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
