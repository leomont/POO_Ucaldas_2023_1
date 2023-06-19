package fintech.businesslogic;

public class Cliente extends Persona {


	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param direccionCorrespondencia
	 * @param contrasena
	 */
	public Cliente(String cedula, String nombre, String apellido, String email, String direccionCorrespondencia,
			String contrasena) {
		super(cedula, nombre, apellido, email, direccionCorrespondencia, contrasena);
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registrarUsuario(String cedula, String nombre, String apellido, String email, String direccionCorrespondencia,
			String contrasena) {
		new Cliente(cedula, nombre, apellido, email, direccionCorrespondencia, contrasena);
		// TODO Auto-generated method stub
		
		
	}

}
