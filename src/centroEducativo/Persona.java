package centroEducativo;

public abstract class Persona {

	private  String nombre;
	private  String nif;
	private String direcci�n;
	private  int telf;
	
	public Persona(String nombre,String nif,String direcci�n,int telf) {
		this.nombre=nombre;
		this.nif=nif;
		this.direcci�n=direcci�n;
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
	public String direcci�n() {
		return direcci�n;
	}
	public void setDirecci�n(String direcci�n) {
		this.direcci�n=direcci�n;
	}
	public int getTelf() {
		return telf;	
	}
	public void setTelf(int telf) {
		this.telf=telf;
	}
	
	
}
