package reus_act9_5;

public abstract class Persona {

	protected String nombre;
	protected char sexo;
	protected int edad;
	protected boolean asistencia;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public abstract void setAsistencia();

	public Persona(String nombre, char sexo, int edad, boolean asistencia) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.asistencia = asistencia;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", asistencia=" + asistencia + "]";
	}

}
