package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private Model instance;

    private List<User> model;

    private Model(){
        model = new ArrayList<>();
    }

    public Model getInstance() {
        return instance;
    }

    public void addUser(User user){
        model.add(user);
    }

    public List<String> getList(){
        return model.stream().map(User::getName).collect(Collectors.toList());
    }
}
