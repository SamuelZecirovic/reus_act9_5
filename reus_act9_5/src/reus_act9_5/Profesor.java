package reus_act9_5;

import java.util.Random;

public class Profesor extends Persona {

	private Materias departamento;
	
	public Profesor(String nombre, char sexo, int edad, Materias mat) {
		super(nombre, sexo, edad);
		this.departamento = mat;
	}
	
	public Materias getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Materias departamento) {
		this.departamento = departamento;
	}

	public void setAsistencia() {
		Random rand = new Random();
		this.asistencia = rand.nextInt(5) != 0;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad
				+ ", asistencia=" + asistencia + "]";
	}
	
	
}
