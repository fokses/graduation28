package ua.fokses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "meal")
public class Meal extends AbstractNamedEntity {
}
