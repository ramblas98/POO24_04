package tp4_ej1;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
        
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return (this.base * this.altura)/2;
    }
    
    @Override
    public double perimetro() {
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2))+ base+altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + ", color= "+color+".";
    }
    
    
}
