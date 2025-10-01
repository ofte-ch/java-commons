package ch.ofte.commons.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NamedBaseEntity extends BaseEntity {
    private String name;
}
