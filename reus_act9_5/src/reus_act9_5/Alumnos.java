package reus_act9_5;

public class Alumnos extends Persona {

	private int calificacion;
	
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Alumnos(String nombre, char sexo, int edad, boolean asistencia, int calificacion) {
		super(nombre, sexo, edad, asistencia);
		this.calificacion = calificacion;
	}

	public Alumnos(String nombre, char sexo, int edad, boolean asistencia) {
		super(nombre, sexo, edad, asistencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Alumnos [calificacion=" + calificacion + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad
				+ ", asistencia=" + asistencia + "]";
	}
	
	
	
}
