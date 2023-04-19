/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.util.Scanner;

/**
 *
 * @author VGetar
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num = leer.nextInt();
        if(num%2==0){
            System.out.println("El valor es par");
        }else{
            System.out.println("El valor es impar");
        }
        
    }
    
}
    
    

