package Ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Rectangulo Rectangulo1 = new Rectangulo(); 

        Rectangulo1.setLargo(50);
        Rectangulo1.setAncho(80);

        System.out.println("El Area es: "+ Rectangulo1.calcularArea());
        System.out.println("El Perimetro es: "+ Rectangulo1.calcularPerimetro());
        
        
        Rectangulo Rectangulo2 = new Rectangulo(); 
        
        Rectangulo2.setLargo(30);
        Rectangulo2.setAncho(70);

        System.out.println("El Area es: "+ Rectangulo2.calcularArea());
        System.out.println("El Perimetro es: "+ Rectangulo2.calcularPerimetro());
        
        Rectangulo Rectangulo3 = new Rectangulo(); 
        
        Rectangulo3.setLargo(90);
        Rectangulo3.setAncho(50);

        System.out.println("El Area es: "+ Rectangulo3.calcularArea());
        System.out.println("El Perimetro es: "+ Rectangulo3.calcularPerimetro());

    }
    
}