package app.model;

import app.entities.User;
import app.services.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private UserService userService ;
    private static Model instance = new Model();

//    private List<User> model;

    private Model(){
        userService = new UserService();
    }

    public static Model getInstance() {
        return instance;
    }

    public void addUser(User user){
        userService.saveUser(user);
    }

    public List<String> getList(){
        return userService.findAllUsers().stream().map(User::getName).collect(Collectors.toList());
    }
}
