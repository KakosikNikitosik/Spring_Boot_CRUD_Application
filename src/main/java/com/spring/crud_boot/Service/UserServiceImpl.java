package com.spring.crud_boot.Service;

import com.spring.crud_boot.dao.UserRepository;
import com.spring.crud_boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void update(User updatedUser) {
        userRepository.saveAndFlush(updatedUser);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }
}
