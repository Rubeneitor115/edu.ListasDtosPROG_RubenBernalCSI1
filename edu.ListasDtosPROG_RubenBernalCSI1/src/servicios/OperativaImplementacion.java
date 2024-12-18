/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

import controladores.Inicio;
import dtos.AlumnoDto;

/**
 * Implementacion de la interfaz operativa
 * @author rbr - 181224
 *
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Metodo que dara de alta un nuevo alumno
	 * rbr - 181224
	 */
	public void altaNuevoAlumno() {
		
		AlumnoDto nuevoAlumnoDto = new AlumnoDto();
		System.out.println("Indica el nombre del alumno: ");
		nuevoAlumnoDto.setNombre(Inicio.scanner.next());
		System.out.println("Indica el apellido1 del alumno: ");
		nuevoAlumnoDto.setApellido1(Inicio.scanner.next());
		System.out.println("Indica el apellido2 del alumno: ");
		nuevoAlumnoDto.setApellido2(Inicio.scanner.next());
		System.out.println("Indica el dni del alumno: ");
		nuevoAlumnoDto.setDni(Inicio.scanner.next());		
		
		Inicio.alumnos.add(nuevoAlumnoDto);

	}

	/**
	 * Metodo que dara de baja un alumno existente
	 * rbr - 181224
	 */
	public void bajaAlumno() {
		
		System.out.println("Indica el dni del alumno que desea borrar: ");
		String dniABorrarString = Inicio.scanner.next();
		
		AlumnoDto alumnoABorrar = new AlumnoDto();
		
		for(AlumnoDto auxiliarAlumno : Inicio.alumnos) { //Iterable
			
			if(dniABorrarString.equals(auxiliarAlumno.getDni())) {
				
				alumnoABorrar = auxiliarAlumno;
				break;
			}
			
		}
		
		Inicio.alumnos.remove(alumnoABorrar);
	}

	/**
	 * Metodo para modificar el nombre de un alumno existente
	 * rbr - 181224
	 */
	public void modificarNombreAlumno() {
		
		
		System.out.println("Indica el dni del alumno que desea modificar: ");
		String dniAModificarString = Inicio.scanner.next();
		
		for(AlumnoDto auxiliarAlumno : Inicio.alumnos) { 
			
			if(dniAModificarString.equals(auxiliarAlumno.getDni())) {
				
				System.out.println("Indica el nuevo nombre: ");
				auxiliarAlumno.setNombre(Inicio.scanner.next());
				break;
			}
			
		}
		
	}
}
