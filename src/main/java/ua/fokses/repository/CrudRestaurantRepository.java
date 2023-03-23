package ua.fokses.repository;

import org.springframework.data.repository.CrudRepository;
import ua.fokses.model.Restaurant;

public interface CrudRestaurantRepository extends CrudRepository<Restaurant, Integer> {
    Restaurant getAllById(Integer id);
}
