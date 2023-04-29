package gradebook;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gradebook {

	/***
	 * 
	 * ***/
	private String courseName;

	/**
	 * @param courseName
	 */
	public Gradebook(String courseName) {
		this.courseName = courseName;
	}

	public Gradebook() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void displayMessage() {
		System.out.println("Bienvenido a la planilla de notas de la UCaldas " + getCourseName());
		System.out.println("Imprimir el # de estudiantes");
	}
	
	
	public void determineClassAverage() {
		
		Scanner input = new Scanner (System.in);
		
		int total =0 ;
		int gradeCounter= 0;
		int grade =0;
		double average=0;
		
		
		System.out.println("Ingrese nueva nota o presion -1 para salir");
		grade = input.nextInt();

		
		while(grade != -1) {
			
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.println("Ingrese nueva nota o presion -1 para salir");
			grade = input.nextInt();
		}
		
		if(gradeCounter != 0) {
			average = (double) total / gradeCounter;
		}
		
		System.out.println("Numero de notas" + gradeCounter);
		System.out.println(" La sumatoria de las notas es: " + total);
		System.out.println(" El promedio de las notas es: " + average);
		
	}

}
