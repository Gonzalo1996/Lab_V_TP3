package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Archivos {

	private String ruta;
	
	//Función que corrobora que el Archivo exista
		public boolean Buscar() 
		{
			File archivo = new File(ruta);
			if(archivo.exists())
				return true;
			return false;
		}

	//Función que lee y muestra el Archivo	
		public void leer() { 
			
			FileReader entrada;
			try {
				entrada = new FileReader(ruta);
					//Para poder Leer Ficheros que contengan tildes y ñ
				BufferedReader miBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(ruta),"cp1252"));
				String linea = "";
				while(linea != null) {
					System.out.println(linea);
					linea = miBuffer.readLine(); //Devuelve la linea del texto que estoy leyendo
				}
				miBuffer.close();
				entrada.close();
			}catch (IOException e) {
				System.out.println("NO SE ENCONTRÓ EL ARCHIVO.");
			}
		}
		
	//Get y Set
		public String getRuta() {
			return ruta;
		}

		public void setRuta(String ruta) {
			this.ruta = ruta;
		}
	
	
}
