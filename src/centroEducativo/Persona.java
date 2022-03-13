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
	public String getDirecci�n() {
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
	
	public String llamar() {
		return this.getNombre() + " llamando a ";
	}
	public abstract String trabajar();
	
	public String toString() {
		return "Nombre: " + this.getNombre() + ", NIF: " + this.getNif() + ", Direcci�n: " + this.getDirecci�n() + " Tel�fono : " + this.getTelf();
	}
	
	
}
