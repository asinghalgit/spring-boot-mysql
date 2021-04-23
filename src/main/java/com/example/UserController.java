package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/all")
    public @ResponseBody Iterable<User> getUsers()
    {
        return userRepository.findAll();
    }

    @PostMapping(value = "/user/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email)
    {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);
        return "Saved";
    }
}
