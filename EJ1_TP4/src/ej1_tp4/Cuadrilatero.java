/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_tp4;

/**
 *
 * @author magal
 */
public class Cuadrilatero extends Figura{
    private double base, altura;
    
    public Cuadrilatero(){
    }
    
    public Cuadrilatero(double base, double altura){
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
        return this.base * this.altura;
    }
    @Override
    public double perimetro(){
        return 2*this.altura + 2*this.base;
    }
}
