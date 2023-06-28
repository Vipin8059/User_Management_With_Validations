package com.geekster.User_Management_With_Validation.service;

import com.geekster.User_Management_With_Validation.model.User;
import com.geekster.User_Management_With_Validation.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(Integer id) {
        List<User> userList = userRepository.getAllUsers();
        for(User user:  userList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String addUsers(List<User> users) {
        List<User> userList = userRepository.getAllUsers();
        userList.addAll(users);
        return "Users added successfully";
    }

    public String updateUser(Integer id, String userName) {
        List<User> userList = userRepository.getAllUsers();
        for(User user:userList){
            if(user.getUserId().equals(id)){
                user.setUserName(userName);
                return "User info update successfully";
            }
        }
        return "unable to update user check terminal";

    }

    public String deleteUserById(Integer id) {
        List<User> userList = userRepository.getAllUsers();
        for(User user:userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "User removed successfully";
            }
        }
        return "Unable to update user check terminal";
    }
}
