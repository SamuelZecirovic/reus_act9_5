package reus_act9_5;
import java.util.Random;

public class Alumnos extends Persona {

	private int calificacion;
	
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Alumnos(String nombre, char sexo, int edad, int calificacion) {
		super(nombre, sexo, edad, true);
		Random claseRandom = new Random();
		int asis = claseRandom.nextInt(1);
		
		if (asis == 1) {
			this.asistencia = true;
		}else {
			this.asistencia = false;
		}
		
		this.calificacion = calificacion;
	}

	

	@Override
	public String toString() {
		return "Alumnos [calificacion=" + calificacion + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad
				+ ", asistencia=" + asistencia + "]";
	}
	
	
	
}
