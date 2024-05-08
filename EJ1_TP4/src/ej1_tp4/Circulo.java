/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_tp4;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public Circulo(){
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    @Override
    public double area(){
        return ( Math.PI * Math.pow(this.radio, 2) );
    }
    @Override
    public double perimetro(){
        return Math.PI * this.radio;
    }
}
