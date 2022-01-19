package reus_act9_5;

public class Aula  {

	private int ID;
	private int Maxestudiantes;
	private Materias materia;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getMaxestudiantes() {
		return Maxestudiantes;
	}

	public void setMaxestudiantes(int maxestudiantes) {
		Maxestudiantes = maxestudiantes;
	}

	public Materias getMateria() {
		return materia;
	}

	public void setMateria(Materias materia) {
		this.materia = materia;
	}

	public Aula(int iD, int maxestudiantes, Materias materia) {
		super();
		ID = iD;
		Maxestudiantes = maxestudiantes;
		this.materia = materia;
	}

	public static void AsistenciasMinimas(Alumnos a) {
			
	}
	
	public static void EntregarNotas(Alumnos a) {
		
	}
		
	@Override
	public String toString() {
		return "Aula [ID=" + ID + ", Maxestudiantes=" + Maxestudiantes + ", materia=" + materia + "]";
	}
		

}


