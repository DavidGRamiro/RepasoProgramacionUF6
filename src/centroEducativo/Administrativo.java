package centroEducativo;

public class Administrativo extends Persona {

	private String tareas;
	
	public Administrativo(String Nombre,String Nif, String direcci�n, int telf,String tareas) {
		super(Nombre,Nif,direcci�n,telf);
		this.tareas=tareas;
	}
	public Administrativo() {
		
	}
	public String getTareas() {
		return tareas;
	}
	public void setTareas(String tareas) {
		this.tareas=tareas;
	}
	
	public String gestionarMatricula() {
		return "La administrativa" + this.getNombre() + "va a gestionar las matriculas";
	}
	public String trabajar() {
		return "La administrativa " + this.getNombre() + "va a realizar estas tareas: " + this.getTareas();
	}
	public String llamar() {
		return this.getNombre() + "llamando a " + this.getNombre();
	}
	@Override
	public String toString() {
		 return "Tareas: " + this.getTareas();
	}
	
	
}

