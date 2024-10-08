package com.example.taskmanagement.controllers;

import com.example.taskmanagement.CrudService;
import com.example.taskmanagement.model.User;
import com.example.taskmanagement.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskmanagerController {

    private UserRepository userRepository;

    // Рекомендуемый вариант внедрения зависимости:
    // внедрение зависимости в класс через конструктор
    public TaskmanagerController(UserRepository userRepository) {
        this.userRepository= userRepository;
    }



    @Autowired
    private CrudService crudService;
    @GetMapping("/users")
    public ResponseEntity<List<User>> getCompanyList() {
        return new ResponseEntity<List<User>>(crudService.getUsersList(), HttpStatus.OK);
    }



}