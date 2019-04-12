
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Lopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i = 1; i<=6; i++){
            for(int j = 1; j<i; j++)
                System.out.print(j);
            System.out.println(" ");
        }
        
    }
    
}
