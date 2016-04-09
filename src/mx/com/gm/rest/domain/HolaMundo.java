package mx.com.gm.rest.domain;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saludo")
public class HolaMundo {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{param}")
	public String getSaludo(@PathParam("param") String nombre){
		return "Hola Mundo XML"+ nombre;
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{param1},{param2}")
	public String getListarPersonas(@PathParam("param1") String nombre, @PathParam("param2") String nombre2){
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona(1,"Gutierrez", "Loyola","lgutierrez1982@gmail.com", "Luis", "68333444"));
		lista.add(new Persona(1,"Faundez", "Muñoz","edith@gmail.com", "Angie", "123456789"));
		lista.add(new Persona(1,"Gutierrez", "Loyola","ariel@gmail.com", "Ariel", "987654321"));
		lista.add(new Persona(1,"Gutierrez", "Loyola","claudia@gmail.com", "Claudia", "12378946"));
		
		String personas = "";
		
		for(Persona p: lista){
			personas = personas + " " + p.getNombre() + " " + p.getEmail() +"\n";
		}
		return "Hola Mundo Personas: \n " + personas;
	}
	
	@GET
	@Produces("application/xml")
	public List<Persona> getListarPersonas(){
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona(1,"Gutierrez", "Loyola","lgutierrez1982@gmail.com", "Luis", "68333444"));
		lista.add(new Persona(1,"Faundez", "Muñoz","edith@gmail.com", "Angie", "123456789"));
		lista.add(new Persona(1,"Gutierrez", "Loyola","ariel@gmail.com", "Ariel", "987654321"));
		lista.add(new Persona(1,"Gutierrez", "Loyola","claudia@gmail.com", "Claudia", "12378946"));
		
		
		return lista;
	}
	
	
	

}
