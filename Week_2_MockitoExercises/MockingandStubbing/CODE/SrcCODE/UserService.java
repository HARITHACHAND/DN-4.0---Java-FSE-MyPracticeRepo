package com.example;

public class UserService {
    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public String getUserName(int id) {
        User user = repo.findUserById(id);
        return user.getName();
    }
}
