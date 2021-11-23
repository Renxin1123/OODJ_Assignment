/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author user
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 9001;
        int sum = 0;
        while (n >0)
        {
            sum += 9001 %10;
            n /= 10;
        }
        System.out.println(sum);
        
         
    }
    
}
