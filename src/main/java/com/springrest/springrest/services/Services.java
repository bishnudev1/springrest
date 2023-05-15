package com.springrest.springrest.services;
import java.util.List;
import com.springrest.springrest.models.User;

public interface Services {
    public List<User> getAllUsers();
    public User getUser(long courseId);
}
