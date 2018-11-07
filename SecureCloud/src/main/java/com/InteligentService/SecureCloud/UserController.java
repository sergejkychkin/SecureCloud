package com.InteligentService.SecureCloud;


import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserRepository repository;


    UserController(UserRepository repository){
        this.repository = repository;
    }



    //------------------------------------------------
    //All

    @GetMapping("/users")
    Resource<User> all(){

        //return new Resource<>(repository.findAll(),linkTo())
    return null;
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser){
        return repository.save(newUser);


    }





    //------------------------------------------------
    //Single


    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) throws UserNotFoundException {

            return  repository.findById(id).orElseThrow(() -> new UserNotFoundException());


    }








}
