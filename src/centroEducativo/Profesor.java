package centroEducativo;

public class Profesor extends Persona {

	private String competencias;
	
	public Profesor (String Nombre,String Nif, String dirección, int telf, String competencias) {
		super(Nombre,Nif,dirección,telf);
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
		return "Competencias : " + this.getCompetencias();
	}
}	
	

