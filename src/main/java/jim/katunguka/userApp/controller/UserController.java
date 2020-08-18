package jim.katunguka.userApp.controller;

import jim.katunguka.userApp.model.User;
import jim.katunguka.userApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getUser(userId);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/{userId}")
    public User editUser(String userId, User user){
        return userService.updateUser(userId, user);
    }


}
