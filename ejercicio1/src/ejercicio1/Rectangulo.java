package Ejercicio1;

public class Rectangulo{
    private double Largo,Ancho;
    
    public Rectangulo(){}

    public double getLargo() {return this.Largo;}
    public double getAncho() {return this.Ancho;}
    
    public void setLargo(double l) {this.Largo = l;}
    public void setAncho(double a) {this.Ancho = a;}
    
    public double calcularArea() {return this.Largo * this.Ancho;} 
    public double calcularPerimetro() {return 2*(this.Largo * this.Ancho);}
    
}