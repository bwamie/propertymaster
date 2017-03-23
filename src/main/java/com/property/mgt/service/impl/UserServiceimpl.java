package com.property.mgt.service.impl;

import com.property.mgt.domain.Authority;
import com.property.mgt.domain.User;
import com.property.mgt.repository.UserRepository;
import com.property.mgt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex_Xie on 20/03/2017.
 */
@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByNumber(Integer id) {
        return userRepository.findOne(id);
    }

    public User getUserByName(String username) {
        if (username == null) {
            return null;
        }

        return userRepository.getUserByUsername(username);
    }

    public LinkedList<Authority> getAllAuthories() {
        Authority client = new Authority("client");
        Authority staff = new Authority("staff");

        LinkedList<Authority> authorities = new LinkedList<Authority>();
        authorities.add(client);
        authorities.add(staff);
        return authorities;
    }


    public Boolean isLoginedUser(User user) {
        if (user == null) {
            return false;
        }

        User localUser = getUserByName(user.getUsername());

        if (localUser != null && localUser.getPassword().equals(user.getPassword())) {
            System.out.println("local pass:" + localUser.getPassword());
            System.out.println("login pass:" + user.getPassword());
            return true;
        }

        System.out.println("local not matched");

        return false;
    }

    public Boolean canRegisterWithUsername(String username) {
        if (username == null) {
            return false;
        }

        User localUser = getUserByName(username);
        if (localUser != null) {
            return false;
        }

        return true;
    }

}