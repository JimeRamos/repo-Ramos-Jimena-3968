
public class Socio {
	private String nombre;
	private int codigo;
	private int edad;
	
	public Socio() {
		
	}

	public Socio(String nombre, int codigo, int edad) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
