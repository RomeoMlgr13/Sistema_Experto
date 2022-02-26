/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_ejercicio;

import fFactorial.clasefactorial;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Factorial_Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Ingrese un digito");
         int n1=s.nextInt();
         clasefactorial cf=new clasefactorial();
         System.out.println("El factorial  de "+n1+" es: "+cf.factorial(n1));
         
    }
    
}
