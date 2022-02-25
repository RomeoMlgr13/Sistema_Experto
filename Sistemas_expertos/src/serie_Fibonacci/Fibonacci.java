/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_Fibonacci;

/**
 *
 * @author alexi
 */
public class Fibonacci {
    public int t;
    public String  nombre;
    
    
    
    //Aplicando recursividad  
    //esto es un sutituto para la iteracion
    //regla  Fibonacci = n-1 + n-2 
    int fibonacci(int n)
{    //regla  Fibonacci = n-1 + n-2 
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  
    }
    else if (n==1) {   
        return 1;
    }
    else if (n==0){  
        return 0;
    }
    else{  
       
        return -1; 
    }
}
    
    public Fibonacci() {
    }

    public Fibonacci(int t, String nombre) {
        this.t = t;
        this.nombre = nombre;
    }
    
    public void sucesion(){
        System.out.println(this.nombre+" de tamaño  "+ this.t+":");
        int i=0;
        System.out.println(i);
       while(i<this.t+ i++){
           System.out.println(fibonacci(i));
           
           
           
           
           if(i==t){break;}
       }
             
        
        
                
                
        
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
