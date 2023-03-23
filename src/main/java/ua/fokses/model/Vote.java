package ua.fokses.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "vote", uniqueConstraints = {
        @UniqueConstraint(name = "uc_vote_user_id_date", columnNames = {"user_id", "vote_date"})
})
public class Vote extends AbstractBaseEntity {
    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "vote_date", nullable = false)
    private LocalDate date;

    @OneToOne(optional = false)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
}
