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
        
        Person admin = new Person("Admin","admin","admin12345","Admin");
        
        FileOperation Fop = new FileOperation();
        Fop.Write2File("LoginDetails.txt", admin.toString2());
        //Fop.ReadfromSerFile("LoginDetails.ser");
    }
    
}
