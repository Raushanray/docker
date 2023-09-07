package com.lcwr.docker.controller;

import com.lcwr.docker.entities.User;
import com.lcwr.docker.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/testApi")
    public String testMethod(){
        return "it is working fine..";
    }

    @PostMapping(path = "/add")
    public ResponseEntity<User>  add(@RequestBody User user){
        User result = userRepo.save(user);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<User>> getAll(){
        List<User> userList = userRepo.findAll();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
