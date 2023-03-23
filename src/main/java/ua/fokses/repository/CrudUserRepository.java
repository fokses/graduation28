package ua.fokses.repository;

import org.springframework.data.repository.CrudRepository;
import ua.fokses.model.User;

interface CrudUserRepository extends CrudRepository<User, Integer> {
    User getById(Integer id);
}

