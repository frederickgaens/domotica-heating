package be.codesolutions.domain.relay;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Relay extends PanacheEntity {

    public int address;
    public int pin;

}
