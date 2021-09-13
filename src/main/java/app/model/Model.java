package app.model;

import app.entities.User;
import app.services.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private UserService userService ;
    private User authorizedUser;
    private static Model instance = new Model();

//    private List<User> model;

    private Model(){
        userService = new UserService();
    }

    public static Model getInstance() {
        return instance;
    }

    public void addUser(User user){
        if (ValidateUser(user) == 0){
            userService.saveUser(user);
            authorizedUser = user;
        }
    }

    public List<String> getList(){
        return userService.findAllUsers().stream().map(User::getName).collect(Collectors.toList());
    }

    public void AuthUser(User user){
        if (ValidateUser(user) == 2){
            authorizedUser = user;
        }
    }

    public void Logout(){
        authorizedUser = null;
    }


    public int ValidateUser(User user){
        if (user == null) return -1;
        List<User> users = userService.findAllUsers();

        for (User listUser: users) {
            if (user.getName().equals(listUser.getName())){
                if (user.getPassword().equals(listUser.getPassword())){
                    return 2;
                }
                else{
                    return 1;
                }
            }
        }

        return 0;
    }
}
