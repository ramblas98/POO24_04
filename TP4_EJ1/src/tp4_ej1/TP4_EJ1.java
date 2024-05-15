
package tp4_ej1;

public class TP4_EJ1 {
    
    public static void main(String[] args) {
        Triangulo t = new Triangulo(1,1);
        Figura r = new Rectangulo(1,1);
        t.setColor("naranja");
        
        System.err.println(t.toString());
        
        System.out.println(t.area());
        
        System.out.println(t.perimetro());
        System.out.println(r.perimetro());
        
        
    }
    
}
