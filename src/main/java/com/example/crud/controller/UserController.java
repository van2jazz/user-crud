package com.example.crud.controller;

import com.example.crud.ApiResponse;
import com.example.crud.entity.User;
import com.example.crud.exceptions.UserNotFoundException;
import com.example.crud.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class UserController {

    @Autowired
    UserService userService ;



    @PostMapping
    public ResponseEntity<User> createPerson(@Valid @RequestBody User user) {
        if (Objects.isNull(user)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getPerson(@PathVariable Long id) throws UserNotFoundException {
        User person = userService.getPerson(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updatePerson(@PathVariable Long id,
                                                    @RequestBody User person) throws Exception {
        Optional<User> optionalPerson = Optional.ofNullable(userService.getPerson(id));

        userService.updatePerson(person, id);
        return new ResponseEntity<>(new ApiResponse(id, person.getName()), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Long id) throws UserNotFoundException {
        userService.deletePerson(id);
        return new ResponseEntity<>("Deleted user successfully " ,HttpStatus.OK);
    }
}

