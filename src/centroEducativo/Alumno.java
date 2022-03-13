package centroEducativo;

public class Alumno extends Persona{

	private String curso;
	
	public Alumno(String Nombre,String Nif, String dirección, int telf, String curso) {
		super(Nombre,Nif,dirección,telf);
		this.curso = curso;
	}
	public Alumno() {
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso=curso;
	}
	public String hacerExamen() {
		return "La alumna " + this.getNombre() + " va a hacer su exámen.";
	}
	public String trabajar() {
		return "La alumna " + this.getNombre() + " esta cursando " + this.getCurso();
	}
	public String llamar() {
		return this.getNombre() + "llamando a " + this.getNombre();
	}
	@Override
	public String toString() {
		return  "Curso: " + this.curso;
	}
	
}
