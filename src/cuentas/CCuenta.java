package cuentas;
/**
 * Esta clase contiene diversos métodos para simular el funcionamiento de una cuenta bancaria.
 * @author joan vinent coll
 * @version 1.0
 */
public class CCuenta {
	
		/**
		 * 
		 */
	 	private String nombre;
	    private String cuenta; 
	    private double saldo;
	    private double tipoInterés;

	    public CCuenta()
	    {
	    }
		/**
		 * Constructor de la clase CCuenta con 4 parámetros.
		 * @param nom nombre del propietario de la cuenta
		 * @param cue cadena de carácteres que hace de identificador de la cuenta
		 * @param sal saldo del propietario de la cuenta
		 * @param tipo tipo de interés de la cuenta
		 */
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        setSaldo(sal);
	    }
	    /**
	     * Método que devuelve el saldo económico que hay en la cuenta bancaria.
	     * @return saldo saldo del propietario de la cuenta
	     */
	    public double estado()
	    {
	        return getSaldo();
	    }
	    /**
	     * Método que permite ingresar una cantidad a la cuenta bancaria.
	     * @param cantidad cantidad que se quiere ingresar en la cuenta
	     * @throws Exception Excepción que se lanza si la cantidad a ingresar es negativa
	     */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        setSaldo(getSaldo() + cantidad);
	    }
	    /**
	     * Método que permite retirar una cantidad del saldo de la cuenta bancaria.
	     * @param cantidad cantidad que se quiere retirar del saldo de la cuenta
	     * @throws Exception Excepción que se lanza si la cantidad es una cantidad negativa o es superior al saldo en cuenta.
	     */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        setSaldo(getSaldo() - cantidad);
	    }
	    /**
	     * Getter de la variable nombre
	     * @return nombre nombre del propietario de la cuenta
	     */
		public String getNombre() {
			return nombre;
		}
		/**
		 * Setter de la variable nombre
		 * @param nombre nombre del propietario de la cuenta
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * Getter de la variable cuenta
		 * @return cuenta identificador de la cuenta
		 */
		public String getCuenta() {
			return cuenta;
		}
		/**
		 * Setter de la variable cuenta
		 * @param cuenta identificador de la cuenta
		 */
		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		/**
		 * Getter de la variable saldo
		 * @return saldo saldo del propietario de la cuenta
		 */
		public double getSaldo() {
			return saldo;
		}
		/**
		 * Setter de la variable saldo
		 * @param saldo saldo del propietario de la cuenta
		 */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		/**
		 * Getter de la variable tipoInterés
		 * @return tipoInterés tipo de interés de la cuenta
		 */
		public double getTipoInterés() {
			return tipoInterés;
		}
		/**
		 * Setter de la variable tipoInterés
		 * @param tipoInterés tipo de interés de la cuenta
		 */
		public void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
	    
		

}
