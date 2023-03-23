package ua.fokses.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "menu", uniqueConstraints = {
        @UniqueConstraint(name = "uc_menu_date_restaurant_id", columnNames = {"menu_date", "restaurant_id"})
})
public class Menu extends AbstractBaseEntity {

    @Column(name = "menu_date", nullable = false)
    private LocalDate date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu")
    private Set<MenuItem> meals;
}
