package centroEducativo;

public class Profesor extends Persona {

	private String competencias;
	
	public Profesor (String competencias) {
		super();
		this.competencias = competencias;
	}
	public Profesor() {	
	}
	public String getCompetencias() {
		return competencias;
	}
	public void setCompetencias(String competencias) {
		this.competencias=competencias;
	}
	public String ponerNotas() {
		return this.getNombre() + "va a corregir los exámenes";
	}
	
		
		
	}
	
	
	

