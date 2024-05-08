/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_tp4;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class Rectangulo extends Cuadrilatero{
    private double base;
    private double altura;
    
    public Rectangulo(){
    }
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }
    @Override
    public double getBase() {
        return base;
    }
    @Override
    public double getAltura() {
        return altura;
    }
    @Override
    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return this.base * this.altura;
    }
    @Override
    public double perimetro(){
        return 2*this.altura + 2*this.base;
    }
    
    public void mostrarAreaRectangulo(){
        System.out.println("Area del rectangulo: "+ area());
    }
    
    public void mostrarPerimetroRectangulo(){
        System.out.println("Perimetro del rectangulo: "+ perimetro());
    }
}
