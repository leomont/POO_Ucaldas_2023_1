package fintech.businesslogic;

public abstract class Persona {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String direccionCorrespondencia;
	private String celular;
	private String contrasena;
	

	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param direccionCorrespondencia
	 * @param contrasena
	 */
	public Persona(String cedula, String nombre, String apellido, String email, String direccionCorrespondencia,
			String contrasena) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccionCorrespondencia = direccionCorrespondencia;
		this.contrasena = contrasena;
	}


	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param celular
	 * @param contrasena
	 */
	public Persona(String cedula, String nombre, String apellido, String celular, String contrasena) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.contrasena = contrasena;
	}


	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param direccionCorrespondencia
	 * @param celular
	 * @param contrasena
	 */
	public Persona(String cedula, String nombre, String apellido, String email, String direccionCorrespondencia,
			String celular, String contrasena) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccionCorrespondencia = direccionCorrespondencia;
		this.celular = celular;
		this.contrasena = contrasena;
	}


	public Persona() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the direccionCorrespondencia
	 */
	public String getDireccionCorrespondencia() {
		return direccionCorrespondencia;
	}


	/**
	 * @param direccionCorrespondencia the direccionCorrespondencia to set
	 */
	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		this.direccionCorrespondencia = direccionCorrespondencia;
	}


	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}


	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}


	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}


	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	/*
	 * Description: Agregar un nuevo usuario
	 * TODO: especificar el tipo de retorno, atributos de entrada
	 */
	public abstract void registrarUsuario(String cedula, String nombre, String apellido, String email, String direccionCorrespondencia,
			String contrasena);
		
	
	
	/*
	 * Description: enviar la contrasena almacenada
	 * TODO: especificar el tipo de retorno, atributos de entrada
	 */
	public void recordarContrasena() {
		
	}
	
	/*
	 * Description: realiza la edicion de un usario usando el numero de celular
	 * TODO: Completar logica retornado un String
	 * */
	public String editarUsuario (String cedula) {
	
		
		return "Usuario ingresado OK";
	}
	
	/*
	 * Description: Listar los usuarios registrados
	 * TODO: Completar logica retornado un String
	 * */
	public void verListaUsuarios() {
		
	}
	
	/*
	 * Description: Desactivar un usuario
	 * TODO: Completar logica retornado un String
	 * */
	public void desactivarUsuario(String cedula) {
		
	}
	
	

}
