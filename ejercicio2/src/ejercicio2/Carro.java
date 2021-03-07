package Ejercicio2;


public class Carro {
    private String color, marca, matricula;
    private int modelo, caballos, puertas;
    
    public Carro(){}
    
    public String getColor(){return this.color;}
    public String getMarca(){return this.marca;}
    public String getMatricula(){return this.matricula;}
    public int getModelo(){return this.modelo;}
    public int getCaballos(){return this.caballos;}
    public int getPuertas(){return this.puertas;}
    
    public void setColor(String c) {this.color = c;}
    public void setMarca(String m) {this.marca = m;}
    public void setMatricula(String ma) {this.matricula = ma;}
    public void setModelo(int mo) {this.modelo = mo;}
    public void setCaballos(int cab) {this.caballos = cab;}
    public void setPuertas(int p) {this.puertas = p;}
      
}