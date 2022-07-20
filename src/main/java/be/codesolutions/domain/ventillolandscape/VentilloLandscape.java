package be.codesolutions.domain.ventillolandscape;

import be.codesolutions.domain.heatpump.Heatpump;
import be.codesolutions.domain.ventillo.Ventillo;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class VentilloLandscape extends PanacheEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    public Heatpump heatpump;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Ventillo> ventillos;

}
