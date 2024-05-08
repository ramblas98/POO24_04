/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_tp4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class EJ1_TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Rectangulo r = new Rectangulo(3,2);
        Cuadrado c = new Cuadrado(2);
        r.mostrarAreaRectangulo();
        r.mostrarPerimetroRectangulo();
        c.mostrarAreaCuadrado();
        c.mostrarPerimetroCuadrado();*/
        Scanner teclado = new Scanner (System.in);
        ArrayList<Figura> lista = new ArrayList();
        int i;
        double valor, base, altura, radio;
        
        for(i = 0; i<3; i++){
            valor = (double)Math.random()*1;
            if(valor > 0.5){
                Rectangulo r = new Rectangulo();
                System.out.println("Ingrese valores para un rectangulo: ");
                System.out.print(">>Base:");
                base = teclado.nextDouble();
                r.setBase(base);
                System.out.print(">>Altura:");
                altura = teclado.nextDouble();
                r.setAltura(altura);
                lista.add(r);
                System.out.println();
                
            }else if(valor <= 0.5){
                Circulo c = new Circulo();
                System.out.print("Ingrese valor de radio para un circulo: ");
                radio = teclado.nextDouble();
                c.setRadio(radio);
                lista.add(c);
                System.out.println();
            }
            
        }
        
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        
        for(Figura figuraActual: lista){
            
            if(figuraActual instanceof Cuadrilatero){
                if(figuraActual instanceof Rectangulo){
                    System.out.println("\nFigura actual: RECTAGULO");
                    ((Rectangulo) figuraActual).mostrarAreaRectangulo();
                }
            }
            
            if(figuraActual instanceof Circulo){
                System.out.println("\nFigura actual: CIRCULO");
                System.out.println("Area del circulo: " + figuraActual.area());
            }
            
        }
    }
    
}
