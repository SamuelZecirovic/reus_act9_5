package reus_act9_5;

import javax.swing.JOptionPane;
import java.util.Random; 

public class Main {

	public static void main(String[] args) {

		Aula aulas[] = new Aula[3];
		
		aulas[0] = new Aula(1,20, Materias.Filosofia);
		aulas[1] = new Aula(2,20, Materias.Matematicas);
		aulas[2] = new Aula(3,20, Materias.Fisica);
		
		CrearAlumnos();
		
	}
	

	
	public static void CrearAlumnos() {
		Random claseRandom = new Random();
		int sexo, edad, calificacion;
		//int peso = Integer.parseInt(JOptionPane.showInputDialog("cuantos alumnos desea crear"));

		Alumnos alumno[] = new Alumnos[20];
		
		for (int i = 0; i < alumno.length; i++) {
			sexo = claseRandom.nextInt(2);
			edad = claseRandom.nextInt(62)+18; //crea un numero aleatorio entre 18 y 79
			calificacion = claseRandom.nextInt(10);
			
			if (sexo == 1) {
			alumno[i] = new Alumnos("alumno"+i,'M',edad,calificacion);
			}else {
			alumno[i] = new Alumnos("alumno"+i,'H',edad,calificacion);
			}
		}

	}

}
