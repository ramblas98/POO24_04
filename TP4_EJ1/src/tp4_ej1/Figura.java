package tp4_ej1;

abstract public class Figura {
    protected String color;
    
    abstract public double area();
    abstract public double perimetro();
    
    public boolean mismaArea(Figura f){
        return (this.area()==f.area());
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
