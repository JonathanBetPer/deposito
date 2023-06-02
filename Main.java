/**
 * @author JonathanBetPer
 * @since 02/06/2023
 * @version v1
 *
 *  Clase Main. App Banco qye controla los datos de una cuenta predeterminada
 *
 */


public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * Método operativa_cuenta.
     * Engloba todas las opciones de la clase CCuenta en el main
     *
     * @param cantidad atributo que pide la actividad
     */
    public static void operativa_cuenta(float cantidad){
        //Variables
        CCuenta cuenta1;
        double saldoActual;

        //Creacion Cuenta
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        //Saldo actual
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );


        //Intenta retirar una cantidad, si salta una excepción sale un mensaje por consola
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }


        //Intenta retirar una cantidad, si salta una excepción sale un mensaje por consola
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

    }
}
