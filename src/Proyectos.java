
public class Proyectos {
	private String nombre;
	private String descripcion;
	private double initialCost;
	public Proyectos() {
		
	}
	
	public Proyectos(String nombre) {
		this.nombre =nombre;
	}
	
	public Proyectos(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion =descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}

	public String elevatorPitch () {
	return	this.nombre+"("+this.initialCost+"):"+this.descripcion;
	}

	
	}
