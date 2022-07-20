package be.codesolutions.web.controller.ventillo;

import be.codesolutions.domain.ventillo.Ventillo;
import be.codesolutions.domain.ventillolandscape.VentilloLandscape;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path(VentilloLandscapeController.URI)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VentilloLandscapeController {

    @GET
    public VentilloLandscape get() {
        return VentilloLandscape.findAll().firstResult();
    }

    @POST
    @Transactional
    public VentilloLandscape add(VentilloLandscape ventilloLandscape) {
        VentilloLandscape.persist(ventilloLandscape);
        return ventilloLandscape;
    }

    public static final String URI = "/ventillo-landscape";
}
