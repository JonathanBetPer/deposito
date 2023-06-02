/**
 * @author JonathanBetPer
 * @since 02/06/2023
 * @version v1
 *
 * Clase CCuenta.
 * Dispone de los atributos y funciones necesarias para operar como una cuenta de un banco financiero
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    /**
     * Constructor de la clase CCuenta
     * (Vacío)
     */
    public CCuenta(){}

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo de la cuenta
     * @return saldo (double)
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que permite ingresar saldo a la cuenta
     *  throws Exception ->  cantidad a ingresar negativa
     * @param cantidad cantidad de saldo a ingresar
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite retirar saldo de la cuenta
     *  throws Exception ->  cantidad a retirar negativa
     *                      saldo insuficiente
     * @param cantidad cantidad de saldo a retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    /**
     * Método que devuelve el nombre del dueño de la cuenta
     * @return El nombre actual
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el tipo de interés que tiene la cuenta (número con decimales)
     * @return tipo de interés (double)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el IBAN asociado a la cuenta
     * @return IBAN de la cuenta (String)
     */
    public String getCuenta() {
        return cuenta;
    }


    /**
     * Método que cambia el valor del número de la cuenta (IBAN
     * @param cuenta IBAN (String)
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Método que devuelve el tipo de interés que tiene la cuenta (número con decimales)
     * @return tipo de interés (double)
     */
    public double getTipoInteres() {
        return tipoInteres;
    }


    /**
     * Método que cambia el valor del tipo de interés
     * @param tipoInteres tipo de interés (double)
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
