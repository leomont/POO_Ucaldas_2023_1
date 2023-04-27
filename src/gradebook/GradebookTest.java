package gradebook;
import java.util.Scanner;

public class GradebookTest {

	public static void main(String[] args) {
		
		Scanner nombreCurso = new Scanner(System.in);
		
		
		Gradebook planillaNotasPoo = new Gradebook("Programacion Orientada a Objetos");
		//Gradebook planillaNotasProgr1 = new Gradebook();
		//Gradebook planillaNotasEstructuras = new Gradebook("Estructuras de datos");
		
		planillaNotasPoo.displayMessage();
		
		planillaNotasPoo.determineClassAverage();
		
		
		
		
		
		
	}

}
