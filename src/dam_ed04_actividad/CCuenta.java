/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * 
 * @author Juan Pérez Ruiz <juanpruiz86@gmail.com>
 * @since 05 De Marzo De 2016
 * @version v1.1.0
 * 
 */
public class CCuenta {

    /**
     * Nombre del Titular de la Cuenta
     */
    private String nombre;
    /**
     * Numero de Cuenta 
     */
    private String cuenta;
    /**
     * Saldo de la cuenta Bancaria
     */
    private double saldo;
    /**
     * Tipo de interés 
     */
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta que inicializa 
     * los atributos a sus valores por defecto
     */
    public CCuenta()
    {
    }
    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
	tipoInterés=tipo;
	
    }
    /**
     * 
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * 
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * 
     * @return 
     */
    public double estado()
    {
        return 	getSaldo();
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        	setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad
     * @throws Exception 
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
     * 
     * @return 
     */
    public String obtenerCuenta()
    {
        return 	getCuenta();
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

   /**
    * 
    * @param tipoInterés 
    */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

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
}
