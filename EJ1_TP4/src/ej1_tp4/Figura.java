/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_tp4;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public abstract class Figura {
    //métodos
    public boolean mismaArea(Figura f){
      return (this.area() == f.area());
    }
    abstract public double area();
    abstract public double perimetro();
}
