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
    //private Appointment1 appointment1;
    //private Appointment2 appointment2;
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
    public Citizens(String na, String em, String pno, String add, String ic, Appointment1 app)
    {
        super(na,em,pno,add,app);
        IC = ic;
        //appointment1 = app;
        //appointment2 = new Appointment2(null,null);
    }
    public Citizens(String na, String em, String pno, String add, String ic, Appointment2 app)
    {
        super(na,em,pno,add,app);
        IC = ic;
        //appointment2 = app;
    }
    //Getter
    public String getIC() {return IC;}
    //public Appointment getAppointment1() {return appointment1;}
    //public Appointment getAppointment2() {return appointment2;}
    //Setter
    /*public void setAppointment1(Appointment1 app)
    {
        appointment1 = app;
    }
    public void setAppointment2(Appointment2 app)
    {
        appointment2 = app;
    }*/
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
        return super.toString2() + ";" + IC + ";" + super.toString3();
    }
    public String toString3()
    {
        return super.toString2() + ";" + IC + super.toString4();
    }
    /*public String toString2()
    {
        return super.toString2() + ";" + IC + ";" + appointment2;
    }
    public String toString3()
    {
        return super.toString2() + ";" + IC + ";" + appointment1.toString();
    }*/

}
