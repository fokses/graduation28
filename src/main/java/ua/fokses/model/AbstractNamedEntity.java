package ua.fokses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import jakarta.persistence.Column;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public abstract class AbstractNamedEntity extends AbstractBaseEntity {
    @Column(name = "name", nullable = false)
    public String name;

    public AbstractNamedEntity(Integer id, String name) {
        super(id);
        this.name = name;
    }
}
