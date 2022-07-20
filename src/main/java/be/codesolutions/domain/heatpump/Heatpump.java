package be.codesolutions.domain.heatpump;

import be.codesolutions.domain.relay.Relay;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Heatpump extends PanacheEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    public Relay heating;

    @ManyToOne(cascade = CascadeType.ALL)
    public Relay cooling;

}
