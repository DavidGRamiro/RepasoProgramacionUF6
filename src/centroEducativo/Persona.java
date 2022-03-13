package centroEducativo;

public abstract class Persona {

	private  String nombre;
	private  String nif;
	private String dirección;
	private  int telf;
	
	public Persona(String nombre,String nif,String dirección,int telf) {
		this.nombre=nombre;
		this.nif=nif;
		this.dirección=dirección;
		this.telf=telf;
	}
	public Persona() { 
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif=nif;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección=dirección;
	}
	public int getTelf() {
		return telf;	
	}
	public void setTelf(int telf) {
		this.telf=telf;
	}
	
	public String llamar() {
		return this.getNombre() + " llamando a ";
	}
	public abstract String trabajar();
	
	public String toString() {
		return "Nombre: " + this.getNombre() + ", NIF: " + this.getNif() + ", Dirección: " + this.getDirección() + " Teléfono : " + this.getTelf();
	}
	
	
}
