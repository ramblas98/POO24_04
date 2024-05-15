package tp4_ej1;

public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return Math.pow(this.radio, 2) * 3.1416;
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Circulo color "+color+", de radio: "+this.radio+".";
    }
    
    
}
   
    
    

