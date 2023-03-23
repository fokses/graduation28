package ua.fokses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.fokses.model.Restaurant;
import ua.fokses.repository.CrudRestaurantRepository;

@RestController
public class RestaurantRestController {
    private CrudRestaurantRepository repository;

    @GetMapping("/user/restaurants/{id}")
    public Restaurant get(@RequestParam Integer id) {
        return repository.getAllById(id);
    }
}
