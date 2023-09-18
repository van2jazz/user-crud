package com.example.crud.service;

import com.example.crud.entity.User;
import com.example.crud.exceptions.UserNotFoundException;
import com.example.crud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers() {

        return userRepo.findAll();
    }

    public User createUser(User user) {

        return userRepo.save(user);
    }

    public User getPerson(Long id) throws UserNotFoundException {
        Optional<User> optional =  userRepo.findById(id);
        if (optional.isEmpty()) {
            throw new UserNotFoundException("User does not exist: " + id);
        }
        return optional.get();
    }

    public void updatePerson(User person, Long id) throws  Exception {
        Optional<User> optionalPerson = userRepo.findById(id);

        if (!optionalPerson.isPresent()){
            throw new Exception("person is not present");
        }
        User person1 = optionalPerson.get();
        person1.setName(person.getName());
        userRepo.save(person1);
    }

    public void deletePerson(Long id) throws UserNotFoundException {
        Optional<User> optionalPerson = userRepo.findById(id);

        if (optionalPerson.isEmpty()){
            throw new UserNotFoundException("User id is invalid");
        }

        userRepo.deleteById(id);
    }
}
