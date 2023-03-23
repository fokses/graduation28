package ua.fokses.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "restaurant")
public class Restaurant extends AbstractNamedEntity {
    public Restaurant(Integer id, String name) {
        super(id, name);
    }
}
