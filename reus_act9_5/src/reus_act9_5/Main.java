package reus_act9_5;

import javax.swing.JOptionPane;
import java.util.Random; 

public class Main {

	public static void main(String[] args) {

		/*
		Aula aulas[] = new Aula[3];
		
		aulas[0] = new Aula(1,20, Materias.Filosofia);
		aulas[1] = new Aula(2,20, Materias.Matematicas);
		aulas[2] = new Aula(3,20, Materias.Fisica);
		*/
		Aula a1 = new Aula(1,20, Materias.Filosofia);
		Profesor p1 = new Profesor("profesor1",'H',40,Materias.Filosofia);
		Alumnos alumno[] = new Alumnos[a1.getMaxestudiantes()];
		CrearAlumnos(alumno);
		
		if(AsistenciasMinimas(a1,p1,alumno)) {
			MostrarNotas(alumno);
		}else {
			if(p1.isAsistencia()) {
				System.out.println("el profesor no ha asistido");
			}else {
			System.out.println("la mitad de la clase no ha asistido");
			}
		}
	}
	
	
	public static void CrearAlumnos(Alumnos[] alumno) {
		Random claseRandom = new Random();
		int sexo, edad, calificacion;
		//int peso = Integer.parseInt(JOptionPane.showInputDialog("cuantos alumnos desea crear"));

		
		
		for (int i = 0; i < alumno.length; i++) {
			sexo = claseRandom.nextInt(2);
			edad = claseRandom.nextInt(62)+18; //crea un numero aleatorio entre 18 y 79
			calificacion = claseRandom.nextInt(10);
			
			if (sexo == 1) {
			alumno[i] = new Alumnos("alumno"+i,'M',edad,calificacion);
			alumno[i].setAsistencia();
			}else {
			alumno[i] = new Alumnos("alumno"+i,'H',edad,calificacion);
			alumno[i].setAsistencia();
			}
			//System.out.println(alumno[i].toString());
		}

	}
	
	public static void MostrarNotas(Alumnos[] alumno) {
		
		String Hnotas = "", Mnotas = "";
		
		for (int i = 0; i < alumno.length; i++) {
			
			if (alumno[i].getCalificacion()>=5) {
				if (alumno[i].getSexo() == 'H') {
					Hnotas += alumno[i].getNombre() + " tiene una calificacion de: " + alumno[i].getCalificacion() +" \n";
				}
				if (alumno[i].getSexo() == 'M') {
					Mnotas += alumno[i].getNombre() + " tiene una calificacion de: " + alumno[i].getCalificacion() +" \n";
				}
			}
			
		}
		System.out.println("Hombres: \n" +Hnotas + "Mujeres: \n" + Mnotas);
		
	}
	
	public static boolean AsistenciasMinimas(Aula a1, Profesor p1, Alumnos[] alumno) {
		
		int asistencias = 0;
		
		if(p1.isAsistencia()) {
			if (p1.getDepartamento().equals(a1.getMateria())) {
				
				for (int i = 0; i < alumno.length; i++) {
					if (alumno[i].isAsistencia()) {
						asistencias++;
					}
				}
			}else {
			return false;
			}
		}else {
		return false;
		}
		
		return (asistencias >= (a1.getMaxestudiantes()/2));
		
	}
	
	

}
