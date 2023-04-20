import java.util.Scanner;

public class GradebookTest {

	public static void main(String[] args) {
		
		Scanner nombreCurso = new Scanner(System.in);
			
		Gradebook planillaNotasPoo = new Gradebook("Programacion Orientada a Objetos");
		Gradebook planillaNotasEstructuras = new Gradebook("Estructuras de datos");
		
		planillaNotasPoo.displayMessage();
		planillaNotasEstructuras.displayMessage();
		
		
		
		
		
		
	}

}
