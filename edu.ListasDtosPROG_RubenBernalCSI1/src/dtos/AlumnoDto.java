package dtos;

public class AlumnoDto {
	
	//Atributos
	int id;
	
	String nombre = "aaaaa";
	
	String apellido1 = "aaaaa";
	
	String apellido2 = "aaaaa";
	
	String nombreCompleto = "aaaaa";
	
	String dni = "aaaaa";
	
	//Constructores
	
	public AlumnoDto(String nombre, String apellido1, String apellido2, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombreCompleto = nombre.concat(" " + apellido1).concat(" " + apellido2);
		this.dni = dni;
	}

	public AlumnoDto() {
		super();
	}
	//Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//Metodo toString
	public String toString() {
		return "Alumno: " + dni + "\n" +
				"nombre: " + nombre
				;
	}

	
	
	
}

