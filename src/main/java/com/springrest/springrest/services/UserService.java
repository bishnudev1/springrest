package com.springrest.springrest.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springrest.springrest.models.User;

@Service
public class UserService implements Services {

    List<User> allUsers;

    public UserService() {
        allUsers = new ArrayList<>();
        allUsers.add(new User(1, "Bishnudev Khutia", "Software Enginner"));
        allUsers.add(new User(2, "Arnab Metya", "Pharmacist"));
    }

    @Override
    public List<User> getAllUsers() {
        return allUsers;
    }

    @Override
    public User getUser(long userId) {
        User u = null;

        for(User user : allUsers){
            if(user.getId() == userId){
                u = user;
                break;
            }
        }
        return u;
    }

}
