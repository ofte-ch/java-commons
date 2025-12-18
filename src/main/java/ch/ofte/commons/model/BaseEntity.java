package ch.ofte.commons.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private long id;
}
