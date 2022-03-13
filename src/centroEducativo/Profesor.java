package centroEducativo;

public class Profesor extends Persona {

	private String competencias;
	
	public Profesor (String Nombre,String Nif, String direcci�n, int telf, String competencias) {
		super(Nombre,Nif,direcci�n,telf);
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
		return this.getNombre() + " va a corregir los ex�menes";
	}
	public String trabajar() {
		return this.getNombre() + " va a impartir su clase";
	}
	@Override
	public String llamar() { 
		return super.llamar();
	}
	
	public String toString() {
		return super.toString() +  " Competencias : " + this.getCompetencias();
	}
}	
	

