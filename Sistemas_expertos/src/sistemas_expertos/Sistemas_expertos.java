/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas_expertos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Sistemas_expertos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
      
       class persona {
    
    public String nombre;
            String genero;
            String genero2;
    String gusto1;
    String gusto2;

            public persona(String nombre, String genero, String genero2, String gusto1, String gusto2) {
                this.nombre = nombre;
                this.genero = genero;
                this.genero2 = genero2;
                this.gusto1 = gusto1;
                this.gusto2 = gusto2;
            }
    

            

            public persona() {
            }
            
   
           
}
        
       
       
 persona p=new persona();
 
 
 p.gusto1="comer";
 p.gusto2="bailar";
 
 p.genero="masculino";
 p.genero2="femenino";
    
 List<String> em=new ArrayList<>();
 em.add(p.nombre="Juan"+p.gusto1+p.genero);
 em.add(p.nombre="Pedro, "+p.gusto2+", "+p.genero);
 em.add(p.nombre="Luis, "+p.gusto2+", "+p.genero);
 em.add(p.nombre="Juan"+p.gusto1+p.genero);
 
 em.add(p.nombre="Ana"+p.gusto1+p.genero2);
 
  
     System.out.println("Mariae estima a :\n"
             + em.get(1)+" y "+
             "\n"+em.get(2));
 
 
 
 
 
 
     
      
   
     
     
        
        
    }
    
}
