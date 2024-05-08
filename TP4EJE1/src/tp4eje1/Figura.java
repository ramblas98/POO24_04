/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4eje1;

/**
 *
 * @author usuario
 */
abstract public class Figura {
    
    abstract public double area();
    abstract public double perimetro();
    
    public boolean mismaArea(Figura f){
        return (this.area()==f.area());
    }
    
    
}


