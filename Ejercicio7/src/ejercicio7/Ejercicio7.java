
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Cuenta Monto=new Cuenta();
        
        Monto.setnameCliente("Santiago");
        Monto.setnumcuenta(45578);
        Monto.setsaldo(5000000);
        
        informacion(Monto);
        
        Monto.consignar();
        Monto.retirar();
    }
    public static void informacion (Cuenta Monto){
        System.out.println("Nombre del cliente: " + Monto.getnameCliente());
        System.out.println("Numero de cuenta: " + Monto.getnumCuenta());
        System.out.println("Saldo: " + Monto.getsaldo());
    }
   
}