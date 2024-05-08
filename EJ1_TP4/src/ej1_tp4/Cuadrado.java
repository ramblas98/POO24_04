/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_tp4;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class Cuadrado extends Cuadrilatero{
    private double lado;
    
    public Cuadrado(){
    }
    
    public Cuadrado(double lado){
        super(lado, lado);
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double area(){
        return this.lado * this.lado;
    }
    
    @Override
    public double perimetro(){
        return 2*this.lado + 2*this.lado;
    }
    public void mostrarAreaCuadrado(){
        System.out.println("Area del cuadrado: "+ area());
    }
    
    public void mostrarPerimetroCuadrado(){
        System.out.println("Perimetro del cuadrado: "+this.perimetro());
    }
}
