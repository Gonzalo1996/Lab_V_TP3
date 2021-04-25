package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TRABAJO PRÁCTICO 3 \n");
		
		//Creación Objeto Archivo
			Archivos file1 = new Archivos();
			file1.setRuta("Archivos/Personas(1).txt");
			
			TreeSet<Persona> listaPersona = new TreeSet<Persona>();
			Iterator<Persona> iterador;
		
		//Corroboramos que el Archivo exista
			System.out.println("------------------------------");
			if(file1.Buscar()) {
				System.out.println("El Archivo existe");
			}
			else {
				System.out.println("El Archivo no existe");
			}
			System.out.println("------------------------------");
		
		//Leemos el Archivo Personas(1).txt
			System.out.println("Lectura Personas(1).txt: ");
			file1.leer();
			
			
		//Treeset	
			System.out.println("TREESET");
			file1.leer(listaPersona);
			
			iterador = listaPersona.iterator();
			
			while(iterador.hasNext()) {
				
				Persona persona = (Persona) iterador.next();
				System.out.println(persona.toString()); //Se muestra el Contenido del TreeSet
			}
	}

}
