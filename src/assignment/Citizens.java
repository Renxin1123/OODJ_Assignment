/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Citizens extends People implements java.io.Serializable{
    private String IC;
    //Constructor
    public Citizens() {}
    public Citizens(String na, String un, String pw)
    {
        super(na,un,pw);
    }
    public Citizens(String na, String em, String pno, String add, String ic)
    {
        super(na,em,pno,add);
        IC = ic;
    }
    public Citizens(String na, String un, String pw, String em, String pno, String add, String ic)
    {
        super(na,un,pw,em,pno,add);
        IC = ic;
    }
    //Getter
    public String getIC() {return IC;}
    //toString Method
    public String toString()
    {
        return super.toString() + ";" + IC;
    }
    public String toString1()
    {
        return super.toString1();
    }
    public String toString2()
    {
        return super.toString2() + ";" + IC;
    }

    
    
    
}
