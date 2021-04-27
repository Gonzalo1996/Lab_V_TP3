package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TRABAJO PRÁCTICO 3 \n");
		
		/*<--------- CREACIÓN DE OBJETOS ARCHIVOS ---------------*/
		
			Archivos file1 = new Archivos();
			Archivos file2 = new Archivos();
			
			file1.setRuta("Archivos/Personas.txt");
			file2.setRuta("Archivos/Resultado.txt");
			
			
			TreeSet<Persona> listaPersona = new TreeSet<Persona>();
			Iterator<Persona> iterador;
		
		/*<--------- CORROBORAMOS QUE EL ARCHIVO EXISTA ---------------*/
			
			System.out.println("****************************");
			
			if(file1.Buscar()) {
				System.out.println("El Archivo existe");
			}
			else {
				System.out.println("El Archivo no existe");
				System.out.println("****************************");
				return;
			}
			
			System.out.println("****************************");
		
		 /*<--------- LEEMOS EL ARCHIVO Personas(1).txt ---------------*/
			
			System.out.println("Lectura Personas(1).txt: ");
			file1.leer();
			
			
		/*<--------- TREESET ---------------*/
			
			System.out.println("****************************");
			System.out.println("TREESET");
			System.out.println("****************************");
			
			
			file1.leer(listaPersona);
			iterador = listaPersona.iterator();
			
			while(iterador.hasNext()) {
				
				Persona persona = (Persona) iterador.next();
				System.out.println(persona.toString()); //Se muestra el Contenido del TreeSet
			}
			

			System.out.println("****************************");
			System.out.println("LECTURA DE Resultado.txt");
			System.out.println("****************************");
			
			file2.escribirLista(listaPersona);
			file2.leer();
	}

}
