package ie.ul.myproject.services;

import ie.ul.myproject.dao.CrossingDAO;
import ie.ul.myproject.models.Crossing;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/crossing")
public class CrossingService {
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{fromPortId}")
    public List<Crossing> getCrossingsByPort(@PathParam("fromPortId") String portId) {
        return CrossingDAO.listCrossings(Integer.parseInt(portId));
    }

}
