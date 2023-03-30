import java.util.Scanner;

public class GradebookTest {

	public static void main(String[] args) {
		
		Scanner nombreCurso = new Scanner(System.in);
			
		Gradebook planillaNotas = new Gradebook();
		
		//System.out.println("El nombre del curso (antes de la asignacion) es : /n" + planillaNotas.getCourseName());
		
		System.out.println("Por favor ingrese el nombre del curso /n: ");	
		String nombreEntradaCurso = nombreCurso.nextLine();
		planillaNotas.setCourseName(nombreEntradaCurso);
		
		System.out.println("El nuevo nombre del curso es : " + planillaNotas.getCourseName());
		
		
		//planillaNotas.displayMessage();
		
		
		
		
		planillaNotas.displayMessage();
	}

}
