package com.geekster.User_Management_With_Validation.configuration;

import com.geekster.User_Management_With_Validation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> getList(){

    User user  = new User(1,"Vipin", LocalDate.of(1996,12,12),"yvipin98130y@gmail.com","91-8059598349",LocalDate.now(), LocalTime.now());
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return userList;
    }
}
