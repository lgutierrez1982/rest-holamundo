package mx.com.gm.rest.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // se agrega para poder realizar @Produces("application/xml") mostrar como XML
public class Persona {
	
	private int idPersona;
	private String apeMaterno;
	private String apePaterno;
	private String email;
	private String nombre;
	private String telefono;
	
	public Persona(){};
	
	public Persona(int idPersona, String apeMaterno, String apePaterno, String email, String nombre, String telefono) {
		super();
		this.idPersona = idPersona;
		this.apeMaterno = apeMaterno;
		this.apePaterno = apePaterno;
		this.email = email;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apeMaterno=" + apeMaterno + ", apePaterno=" + apePaterno
				+ ", email=" + email + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	} 
	
	
	
	

}
