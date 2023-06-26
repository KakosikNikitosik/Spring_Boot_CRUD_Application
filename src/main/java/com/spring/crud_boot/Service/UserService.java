package com.spring.crud_boot.Service;

import com.spring.crud_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User findById(Long id);

    void update(User updatedUser);

    void delete(Long id);
}
