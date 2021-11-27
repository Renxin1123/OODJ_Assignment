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
    //Getter
    public String getEmail() {return Email;}
    public String getPhoneNumber() {return PhoneNumber;}
    public String getAddress() {return Address;}
    
    //toString Method
    public String toString()
    {
        return super.toString() + ";" + Email + ";" + PhoneNumber + ";" + Address;
    }
    public String toString1()  //name,username,password
    {
        return super.toString();
    }
    public String toString2()
    {
        return super.toString1() + ";" + Email + ";" + PhoneNumber + ";" + Address;
    }
}
