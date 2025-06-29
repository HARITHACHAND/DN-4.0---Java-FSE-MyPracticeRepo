package com.example;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUserName(int id) {
        User user = repository.findUserById(id);
        return user.getName();
    }
}
