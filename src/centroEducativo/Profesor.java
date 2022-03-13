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
		return this.getNombre() + " va a corregir los exámenes";
	}
	public String trabajar() {
		return this.getNombre() + " va a impartir su clase";
	}
	@Override
	public String llamar() { 
		return this.getNombre() + "llamando a " + this.getNombre();
	}
	@Override
	public String toString() {
		return super() + "Competencias : " + this.getCompetencias();
	}
}	
	

