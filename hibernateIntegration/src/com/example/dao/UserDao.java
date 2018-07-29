package com.example.dao;


import java.util.List;

import com.example.model.User;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}