/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosEstructurasCondicionales;

import static EjerciciosEstructurasCondicionales.EJercicio1.pedirNumero;

/**
 *
 * @author jorge
 */
public class Ejercicio2 {
    
    static void evaluar(int a,int b , int c){
    
        if (a>b&&a>c) {
            System.out.println("El mayor es " + a);
            
        } else if (b>c) {
            System.out.println("El mayor es " + b);
        }
        else{
        
            System.out.println("El Mayor es " + c);
        
        }
    
    
    }
    public static void main(String[] args) {
        int a,b,c;
        a=pedirNumero();
        b=pedirNumero();
        c=pedirNumero();
        evaluar(a,b,c);
    }
 
    
    
}
