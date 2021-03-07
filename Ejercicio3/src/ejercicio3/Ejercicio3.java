package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static double mayorArea(Triangulo triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area; 
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,lado; 
        int nTriangulos;
        
        System.out.println("Digite el numero de triangulos : ");
        nTriangulos = entrada.nextInt();
        
        Triangulo triangulos[] = new Triangulo[nTriangulos];
        
        for(int i=0; i<triangulos.length;i++){
            System.out.println("\nDigite los valores para el triangulo "+ (i+1) + ":");
            System.out.print("Digite la base: ");
            base = entrada.nextDouble();
            System.out.print("Digite el lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo(base, lado);
            
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("\nEl area del triangulo es: "+triangulos[i].obtenerArea());
        }
        
        System.out.println("\nEl area del triangulo con mayor superficie es: "+mayorArea(triangulos));
    }
    
}