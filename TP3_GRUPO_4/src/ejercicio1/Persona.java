package ejercicio1;

public class Persona implements Comparable<Persona>{
	
	private int id;
	private String dni;
	private String nombre; 
	private String apellido;
	private static int contId = 0;
	
	/*<-------------CONSTRUCTORES----------------->*/
	
	public Persona() {
		contId ++;
		this.id = contId;
		this.dni = "111111";
		this.nombre = "Sin nombre";
		this.apellido = "Sin apellido";
	}
	
	public Persona(String dni, String nombre, String apellido) {
		contId ++;
		this.id = contId;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int compareTo(Persona persona) {
		if(persona.equals(this))
			return 0;
		else
		{
			if(persona.getApellido().compareTo(this.getApellido()) < 0)
				return 1;
			else 
				return -1;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Persona other = (Persona) o;
		
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		
		if(dni==null) {
			if(other.dni !=null)
				return false;
		}else if (!dni.equals(other.dni))
			return false;
			
		
		//if (dni != other.dni)
			//return false;
		
		
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
			return "DNI: " + dni + " Nombre: " + nombre + " Apellido: " + getApellido();
	}
	
}
