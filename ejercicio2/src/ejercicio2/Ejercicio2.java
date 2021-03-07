package Ejercicio2;

public class Ejercicio2{

    public static void main(String[] args) {
        
        Carro Carro1 = new Carro();
        
        Carro1.setColor("Rojo");
        Carro1.setMarca("Mazda 3");
        Carro1.setMatricula("BKL-160");
        Carro1.setModelo(2017);
        Carro1.setCaballos(250);
        Carro1.setPuertas(5);
        
        printInfoCoche(Carro1);
    }
    
    public static void printInfoCoche (Carro Carro1){
        System.out.println("Color: " + Carro1.getColor());
        System.out.println("Modelo: " + Carro1.getModelo());
        System.out.println("Marca: " + Carro1.getMarca());
        System.out.println("Matricula: " + Carro1.getMatricula());
        System.out.println("No Caballos: " + Carro1.getCaballos());
        System.out.println("No Puertas: " + Carro1.getPuertas());
        
    }
}