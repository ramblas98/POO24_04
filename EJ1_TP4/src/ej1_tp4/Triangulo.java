/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_tp4;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class Triangulo extends Figura{
    private double l1, l2, l3;
    
    public Triangulo(double l1, double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    public Triangulo(){
    }
    
    public double getL1(){
        return l1;
    }
    public double getL2(){
        return l2;
    }
    public double getL3(){
        return l3;
    }
    
    public void setL1(double l1){
        this.l1 = l1;
    }
    public void setL2(double l2){
        this.l2 = l2;
    }
    public void setL3(double l3){
        this.l3 = l3;
    }
    @Override
    public double perimetro(){
        return l1 + l2 + l3;
    }
    
    @Override
    public double area(){
        double s = (l1 + l2 + l3) / 2;
        double resultado = s * (s-l1) * (s-l2) * (s-l3);
        return (Math.sqrt(resultado));
    }
    
    public boolean esRectangulo(double lado1, double lado2, double lado3){
        boolean band = false;
        
        if(lado1 > lado2 && lado1 > lado3){
            if( Math.pow(lado1, 2) == (Math.pow(lado2,2) + Math.pow(lado3, 2)) ) band = true;
        }
        
        if(lado2 > lado1 && lado2 > lado3){
            if( Math.pow(lado2, 2) == (Math.pow(lado1,2) + Math.pow(lado3, 2)) ) band = true;
        }
        
        if(lado3 > lado1 && lado3 > lado2){
            if( Math.pow(lado2, 2) == (Math.pow(lado1,2) + Math.pow(lado2, 2)) ) band = true;
        }
        
        return band;
    }
    
    public void tipoTriangulo(double l1, double l2, double l3){
        if(l1 == l2 && l1 == l3 && l2 == l3) System.out.println("EQUILATERO");
        if(l1 != l2 && l2 != l3 && l1 != l3) System.out.println("ESCALENO");
        if(l1 == l2 && l1 != l3 || l2 == l1 && l2 != l3 || l3 == l1 && l3 != l2) System.out.println("ISOSCELES");
    }
}
