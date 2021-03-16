package unidad4;


public class Ccuenta {
	
	/**@author jesgo
	 * 
	 */

	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInter�s;
	
	public Ccuenta() {
	}

	public Ccuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInter�s = tipo;
	}

	public void asignarNombre(String nom) {
		nombre = nom;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public double estado() {
		return saldo;
	}
	
	/**
	 * Metodo para controlar la cantidad ingresada por el usuario
	 * @param cantidad lo que el usuario tiene que retirar, sera un importe economico
	 * @throws Lanza excepcion para que no sea posible ingresar una cantidad menor a 0
	 */

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
	
	/**
	 * M�todo que sirve para controlar el importe que el usuario retira
	 * @param cantidad lo que el usuario tiene que retirar, sera un importe economico
	 * @throws Lanza excepci�n en caso de que se retire una cantidad negativa o no haya suficiente saldo
	 */

	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	public String obtenerCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @return sin retorno
	 */

	public double getTipoInter�s() {
		return tipoInter�s;
	}
	
	/**
	 * 
	 * @param tipoInter�s 
	 */

	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}

