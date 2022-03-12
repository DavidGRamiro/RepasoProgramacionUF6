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
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNig(String nif) {
		this.nif=nif;
	}
	public String dirección() {
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
	
	
}
