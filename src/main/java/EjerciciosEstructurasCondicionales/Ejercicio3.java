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
public class Ejercicio3 {
    
    static int multiplicacion(int a,int b,int c){
    int operacion=0;
      
       
        if(a<0){
        
        operacion=b*c;
        
        }
        else if (b<0)
        operacion=a*c;
        
        else {
        operacion=b*a;
        }
        
        
    return operacion;
  }
    public static void main(String[] args) {
        int a,b,c,d;
        a=pedirNumero();
        b=pedirNumero();
        c=pedirNumero();
       d=multiplicacion(a,b,c);
        System.out.println("Resultado " + d);
    }
 
}
