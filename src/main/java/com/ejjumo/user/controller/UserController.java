package com.ejjumo.user.controller;

import com.ejjumo.user.dto.User;
import com.ejjumo.user.dto.UserPlaylist;
import com.ejjumo.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public UserPlaylist getUser(@RequestParam("id") int userId) throws SQLException {
        return userService.findUser(userId);
    }

    @GetMapping("/list")
    public List<User> getAllUsers() throws SQLException {
        return userService.findAllUsers();
    }
}
