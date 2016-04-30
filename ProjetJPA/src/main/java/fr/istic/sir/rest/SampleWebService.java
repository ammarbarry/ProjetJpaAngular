package fr.istic.sir.rest;

import domain.Chauffage;
import domain.Device;
import domain.EquipElectronic;
import domain.Residence;

@Path("/hello")
public class SampleWebService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello, how are you?";
	}
	
	@GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public Residence getResidence() {
		Residence h = new Residence();
		h.setTaille(5);
		Device h1 = new Chauffage();
		h1.setConsoMoyenne("500w");
		Device h2 = new EquipElectronic();
		h2.setConsoMoyenne("600w");
		//h.addDevice(h1);
		//h.addDevice(h2);
		return h;
	}

}

