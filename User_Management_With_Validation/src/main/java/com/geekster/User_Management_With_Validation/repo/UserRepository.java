package com.geekster.User_Management_With_Validation.repo;

import com.geekster.User_Management_With_Validation.configuration.BeanFactory;
import com.geekster.User_Management_With_Validation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    List<User> userList;

    public List<User> getAllUsers() {
        return userList;
    }


}
