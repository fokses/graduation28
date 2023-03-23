package ua.fokses.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ua.fokses.App;
import ua.fokses.model.Restaurant;

import static org.junit.jupiter.api.Assertions.*;
import static ua.fokses.TestData.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {App.class})
@Sql({"classpath:sql/init.sql", "classpath:sql/testData.sql"})
class CrudRestaurantRepositoryTest {

    @Autowired
    CrudRestaurantRepository repository;

    @Test
    public void getAllById() {
        Restaurant byId1 = repository.getAllById(1);
        assertEquals(RESTAURANT_1, byId1);
    }

}