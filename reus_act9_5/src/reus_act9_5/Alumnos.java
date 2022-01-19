package reus_act9_5;


public class Alumnos extends Persona  {

	private int calificacion;
	
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Alumnos(String nombre, char sexo, int edad, int calificacion) {
		super(nombre, sexo, edad, true);
		this.calificacion = calificacion;
	}
	
	public void setAsistencia() {
		return;
	}
	
	@Override
	public String toString() {
		return "Alumnos [calificacion=" + calificacion + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad
				+ ", asistencia=" + asistencia + "]";
	}
	
	
	
}
