package com.property.mgt.service;

import com.property.mgt.domain.Authority;
import com.property.mgt.domain.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex_Xie on 20/03/2017.
 */
public interface UserService {
    List<User> getAllUsers();

    LinkedList<Authority> getAllAuthories();

    User addUser(User user);

    User getUserByNumber(Integer id);

    User getUserByName(String username);

    Boolean isLoginedUser(User user);

    Boolean canRegisterWithUsername(String username);



}