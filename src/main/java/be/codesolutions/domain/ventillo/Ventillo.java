package be.codesolutions.domain.ventillo;

import be.codesolutions.domain.relay.Relay;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
public class Ventillo extends PanacheEntity {

    public String name;

    @OneToOne(cascade = CascadeType.ALL)
    public Relay heatingValve;

    @OneToOne(cascade = CascadeType.ALL)
    public Relay coolingValve;
}
