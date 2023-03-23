package ua.fokses.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "menu_item", uniqueConstraints = {
        @UniqueConstraint(name = "uc_menuitem_menu_id_meal_id", columnNames = {"menu_id", "meal_id"})
})
public class MenuItem extends AbstractBaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    @OneToOne(optional = false)
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;

    @Column(name = "price", nullable = false)
    private Long price;

}
