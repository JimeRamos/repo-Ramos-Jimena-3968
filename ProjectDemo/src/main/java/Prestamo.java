
public class Prestamo {
	private int codigo;
	private String nombre_socio;
	private int monto;
	
	public Prestamo() {
		
	}

	public Prestamo(int codigo, String nombre_socio, int monto) {
		super();
		this.codigo = codigo;
		this.nombre_socio = nombre_socio;
		this.monto = monto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre_socio() {
		return nombre_socio;
	}

	public void setNombre_socio(String nombre_socio) {
		this.nombre_socio = nombre_socio;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	
}
