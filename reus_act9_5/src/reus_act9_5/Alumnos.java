package reus_act9_5;

import java.util.Random;

public class Alumnos extends Persona  {

	private int calificacion;
	
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Alumnos(String nombre, char sexo, int edad, int calificacion) {
		super(nombre, sexo, edad);
		this.calificacion = calificacion;
		setAsistencia();
	}
	
	public void setAsistencia() {
		Random rand = new Random();
		this.asistencia = rand.nextInt(2) == 0;
	}
	
	@Override
	public String toString() {
		return "Alumnos [calificacion=" + calificacion + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad
				+ ", asistencia=" + asistencia + "]";
	}
	
	
	
}
