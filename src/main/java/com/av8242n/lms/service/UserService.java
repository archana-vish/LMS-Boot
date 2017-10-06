package com.av8242n.lms.service;

import com.av8242n.lms.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User getUser(int id);
    User addUser(User user);
    User editUser(User user);
    List<User> removeUser(int id);
}
