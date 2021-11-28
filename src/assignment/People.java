/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class People extends Person{
    protected String Email;
    protected String PhoneNumber;
    protected String Address;
    private Appointment1 appointment1;
    private Appointment2 appointment2;
    //Constructor
    public People() {}
    public People(String na, String un, String pw)
    {
        super(na,un,pw);
    }
    public People(String na, String em, String pno, String add)
    {
        super(na);
        Email = em;
        PhoneNumber = pno;
        Address = add;
    }
    public People(String na, String un, String pw, String em, String pno, String add)
    {
        super(na,un,pw);
        Email = em;
        PhoneNumber = pno;
        Address = add;
    }
    public People(String na, String em, String pno, String add, Appointment1 app)
    {
        //super(na,em,pno,add);
        super(na);
        Email = em;
        PhoneNumber = pno;
        Address = add;
        appointment1 = app;
        appointment2 = new Appointment2(null,null);
    }
    public People(String na, String em, String pno, String add, Appointment2 app)
    {
        //super(na,em,pno,add);
        super(na);
        Email = em;
        PhoneNumber = pno;
        Address = add;
        appointment2 = app;
        appointment1 = new Appointment1(null,null);
    }
    //Getter
    public String getEmail() {return Email;}
    public String getPhoneNumber() {return PhoneNumber;}
    public String getAddress() {return Address;}
    public Appointment getAppointment1() {return appointment1;}
    public Appointment getAppointment2() {return appointment2;}
    
    //toString Method
    public String toString()
    {
        return super.toString() + ";" + Email + ";" + PhoneNumber + ";" + Address;
    }
    public String toString1()  //name,username,password
    {
        return super.toString();
    }
    public String toString2() //name
    {
        return super.toString1() + ";" + Email + ";" + PhoneNumber + ";" + Address;
    }
     public String toString3()
    {
        return appointment1.toString();
    }
    public String toString4()
    {
        return appointment2.toString();
    }
}
