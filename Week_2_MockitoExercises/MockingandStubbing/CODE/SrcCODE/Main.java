package com.example;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository() {
            @Override
            public User findUserById(int id) {
                return new User("Haritha");
            }
        };

        UserService service = new UserService(repo);
        String name = service.getUserName(1);
        System.out.println("User name fetched: " + name);
    }
}
