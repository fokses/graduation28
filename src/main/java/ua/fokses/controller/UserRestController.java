package ua.fokses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import ua.fokses.model.User;
import ua.fokses.repository.UserRepository;

public class UserRestController {
    final UserRepository repository;

    public UserRestController(UserRepository repository) {
        this.repository = repository;
    }


    public User getUser() {
        return repository.getById(1);
    }
}
