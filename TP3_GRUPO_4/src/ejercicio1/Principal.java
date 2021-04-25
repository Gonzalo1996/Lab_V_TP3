package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TRABAJO PRÁCTICO 3 \n");
		
		//Creación Objeto Archivo
			Archivos file1 = new Archivos();
			file1.setRuta("Archivos/Personas(1).txt");
		
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
	}

}
