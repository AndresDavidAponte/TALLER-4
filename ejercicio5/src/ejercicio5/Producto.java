package Ejercicio5;

public class Producto {
    
    String Nombre;
    float Codigo, PrecioCompra;
    float Utilidad;
    
    public Producto(){} 
    
    public String getNombre() {return this.Nombre;}
    public float getCodigo() {return this.Codigo;}
    public float getPrecioCompra() {return this.PrecioCompra;}
    public float getUtilidad() {return this.Utilidad;}
    
    public void setNombre(String n) {this.Nombre = n;}
    public void setCodigo(float c) {this.Codigo = c;}
    public void setPrecioCompra(float p) {this.PrecioCompra = p;}
    public void setUtilidad(float u) {this.Utilidad = u;}
    
    public static float calcularGanancia() {return this.PrecioCompra + (this.PrecioCompra * this.Utilidad);}
    
    
    
}