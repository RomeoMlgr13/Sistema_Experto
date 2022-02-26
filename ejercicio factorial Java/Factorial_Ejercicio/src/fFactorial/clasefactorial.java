/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fFactorial;

/**
 *
 * @author alexi
 */
public class clasefactorial {
    public int factorial(int n){
        if (n==0){//aplicando recursividad 
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
   
        
    }
}
