package ch.ofte.commons.model;

import java.util.UUID;
import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BaseUuidEntity extends BaseEntity {
    private UUID uuid;
}
