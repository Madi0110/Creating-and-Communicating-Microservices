package com.example.courseuser.controller;

import com.example.courseuser.model.CustomUser;
import com.example.courseuser.model.UserCourse;
import com.example.courseuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/getUserByUsername")
    public ResponseEntity<?> getUserByUsername(@RequestParam("username") String username) {
        return ResponseEntity.ok(userService.getUserByUsername(username));
    }

    @GetMapping("/getUserCourses")
    public ResponseEntity<?> getUserCourses(@RequestParam("username") String username) {
        return ResponseEntity.ok(userService.getUserCourses(username));
    }

    @DeleteMapping("/deleteCourseFromUser")
    public void deleteCourseFromUser(@RequestParam("courseId") Long courseId,@RequestParam("userId") Long userId) {
        userService.deleteCourseFromUser(courseId,userId);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody CustomUser customUser) {
        userService.createUser(customUser);
    }

    @PostMapping("/createUserCourse")
    public void createUserCourse(@RequestBody UserCourse userCourse) {
        userService.createUserCourse(userCourse);
    }

}
