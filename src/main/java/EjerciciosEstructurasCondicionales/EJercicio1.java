/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EJercicio1 {
    
    static int pedirNumero(){
    int numero =0;
        Scanner lector = new Scanner(System.in);
        System.out.println("ingresar Numero");
        numero=lector.nextInt();    
    
    return numero;
    }
    
    static void evaluar(int a , int b ){
    
        if (a >b) {
            System.out.println("el mayor es " +a);
        } else if(a==b) {
            System.out.println("son iguales ");
        }
        else   {
        
            System.out.println("el mayor es " + b);
        
        }
        
   
    
    
    
    }
    
    public static void main(String[] args) {
        int a,b;
        a=pedirNumero();
        b=pedirNumero();
        evaluar(a,b);
        
        
    }
    
}
