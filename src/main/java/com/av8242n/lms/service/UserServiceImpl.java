package com.av8242n.lms.service;

import com.av8242n.lms.model.User;
import com.av8242n.lms.repositories.LeaveRepository;
import com.av8242n.lms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        Iterator<User> iterator = userRepository.findAll().iterator();
        while (iterator.hasNext()) {
            users.add(iterator.next());
        }
        return  users;
    }

    @Override
    public User getUser(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User editUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> removeUser(int id) {
         userRepository.delete(id);
         return getUsers();
    }
}
