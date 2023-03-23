package ua.fokses.repository.readOnly;

import org.springframework.data.repository.Repository;
import ua.fokses.model.Menu;

import java.time.LocalDate;
import java.util.List;

public interface MenuReadOnlyRepository extends Repository<Menu, Integer> {
    List<Menu> findByDate(LocalDate date);
}
