package com.example.crud.service;

import com.example.crud.entity.User;
import com.example.crud.repository.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers(){
        return userDao.findAll();
    }

    public void saveUser(User user){
         userDao.save(user);
    }

    public User getUserById(Long id){
        return userDao.findById(id).get();
    }

    public void updateUser(User user){
         userDao.save(user);
    }


    public void deleteById(Long id){
         userDao.deleteById(id);
    }




}
