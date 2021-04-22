package ejercicio1;

public class Personas {
	
	private int id;
	private int dni;
	private String nombre; 
	private String apellido;
	private static int contId = 0;
	
	/*<-------------CONSTRUCTORES----------------->*/
	
	public Personas() {
		contId ++;
		this.id = contId;
		this.dni = 111111;
		this.nombre = "Sin nombre";
		this.apellido = "Sin apellido";
	}
	
	public Personas(int dni, String nombre, String apellido) {
		contId ++;
		this.id = contId;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	

}
