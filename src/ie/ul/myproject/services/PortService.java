package ie.ul.myproject.services;

import ie.ul.myproject.dao.PortDAO;
import ie.ul.myproject.models.Port;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/port")
public class PortService {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{countryCode}")
    public List<Port> getPortsByCountry(@PathParam("countryCode") String countryCode) {
        return PortDAO.listPorts(countryCode);
    }
	
}
