
package ejercicio7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cuenta {
    
    int numCuenta;
    String nameCliente;
    double saldo;
    
    public Cuenta(){}
    
        public int getnumCuenta() {return this.numCuenta;}
        public String getnameCliente() {return this.nameCliente;}
        public double getsaldo() {return this.saldo;}
        
        public void setnumcuenta(int ncu) {this.numCuenta = ncu;}
        public void setnameCliente(String ncl) {this.nameCliente = ncl;}
        public void setsaldo(double s) {this.saldo = s;}
       
       
        public void consignar(){
            
            double monto;
            Scanner montoo = new Scanner(System.in);
            System.out.println("Usted ha elegido consignar saldo "); monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a ingresar: "));
            System.out.println("Usted ha consignado : " + monto);
        
        
        }
    
        public void retirar(){
            double monto;
            Scanner retirarr = new Scanner(System.in);
            System.out.println("Usted ha elegido retirar saldo "); monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar: "));
            System.out.println("Usted ha retirado: " + monto); 
        
        }
    
}
