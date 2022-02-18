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
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
        
        List<String> estimadosmaria=new ArrayList<>();
    
     estimadosmaria.add("Juan");
     estimadosmaria.add("Pedro");
     estimadosmaria.add("Luis");
     estimadosmaria.add("Ana");
     estimadosmaria.add("Mateo");
     
     // a pedro y a luis les guta bailar 
     
        System.out.println("?");
        
        String m =in.nextLine();
        
        if(m.equals("maria")){
            System.out.println("maria estima:  "+
                    "\n"+estimadosmaria.get(1)+
                    "\n"+estimadosmaria.get(2));
        }
        
   
     
     
        
        
    }
    
}
