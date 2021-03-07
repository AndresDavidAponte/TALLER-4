package Ejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        Producto Producto1= new Producto();
        
        int Elem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
        
        float[] preciocompra = new float[Elem];
        float[] codigos = new float[Elem];
        float[] utilidad = new float[Elem];
        String[] nombres = new String[Elem];
        
        for (int i=0;i<Elem;i++){
            System.out.println((i+1)+ " .Nombre producto: "); nombres[i]= lector.next(); 
            System.out.println((i+1)+ " .Pecio de compra producto: "); preciocompra[i]= lector.nextFloat();
            System.out.println((i+1)+ " .Codigo producto: "); codigos[i]= lector.nextFloat();
            System.out.println((i+1)+ " .Porcentaje de utilidad producto (50%=0.5 , 20%=0.2): "); utilidad[i]= lector.nextFloat();
            System.out.println(((i+1)+ " .Precio de venta producto: ") + Producto.calcularGanancia()); 
        }                 
    }
}