package ua.fokses.repository;

import org.springframework.stereotype.Repository;
import ua.fokses.model.User;

@Repository
public class UserRepository {
    final CrudUserRepository userRepository;

    public UserRepository(CrudUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(Integer id) {
        return userRepository.getById(id);
    }
}
