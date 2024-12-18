/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDto;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 181224
 *
 */
public class Inicio {

	
	public static Scanner scanner = new Scanner(System.in);
	public static List<AlumnoDto> alumnos = new ArrayList<AlumnoDto>();
	
	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 181224
	 * @param args
	 */
	public static void main(String[] args) {
		
		AlumnoDto alumnoAdminAlumnoDto = new AlumnoDto("admin","admin","admin","admin" );
		alumnos.add(alumnoAdminAlumnoDto);		
		//Alta nuevo alumno
		OperativaInterfaz oi = new OperativaImplementacion();
		
		for(int i=0; i<5; i++) {
			oi.altaNuevoAlumno();
		}
		
		for(AlumnoDto alumnoAuxiliar : alumnos) {
			
			System.out.println(alumnoAuxiliar.toString());
			
		}
		
		System.out.println(alumnos.get(0).toString());
		
		oi.bajaAlumno();
		
		System.out.println("-----Resultado-----");
		
		for(AlumnoDto alumnoAuxiliar : alumnos) {
			
			System.out.println(alumnoAuxiliar.toString());
			
		}
		
		oi.modificarNombreAlumno();
		
		System.out.println("-----Resultado-----");
		
		for(AlumnoDto alumnoAuxiliar : alumnos) {
			
			System.out.println(alumnoAuxiliar.toString());
			
		}

	}

}
