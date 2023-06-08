package fintech.businesslogic;

public class Cuenta implements operacionesCuenta{


	private double saldo;
	private String celular;
	
	
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}


	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
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


	public Cuenta() {
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public void consigar(double saldo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void retirar(double saldo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void verSaldo(String celular) {
		// TODO Auto-generated method stub
		
	}

}
