
public class Autor {
	private String nombre;
	private String libro;
	private int edad;
	
	public Autor() {
		
	}

	public Autor(String nombre, String libro, int edad) {
		super();
		this.nombre = nombre;
		this.libro = libro;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
