package centroEducativo;

public class Alumno {

	private String curso;
	
	public Alumno(String curso) {	
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
		return super() + "Curso: " + this.curso;
	}
	
}
