package centroEducativo;

public class Administrativo extends Persona {

	private String tareas;
	
	public Administrativo(String tareas) {
		this.tareas=tareas;
	}
	public String getTareas() {
		return tareas;
	}
	public void setTareas(String tareas) {
		this.tareas=tareas;
	}
	
}

