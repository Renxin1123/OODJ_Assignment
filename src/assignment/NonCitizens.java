/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class NonCitizens extends People implements java.io.Serializable{
    private String PassportNo;
    private Appointment1 appointment1;
    private Appointment2 appointment2;
    //Constructor
    public NonCitizens() {}
    public NonCitizens(String na, String un, String pw)
    {
        super(na,un,pw);
    }
    public NonCitizens(String na, String em, String pno, String add, String passport)
    {
        super(na,em,pno,add);
        PassportNo = passport;
    }
    public NonCitizens(String na, String un, String pw, String em, String pno, String add, String passport)
    {
        super(na,un,pw,em,pno,add);
        PassportNo = passport;
    }
    public NonCitizens(String na, String em, String pno, String add, String passport, Appointment1 app)
    {
        super(na,em,pno,add);
        PassportNo = passport;
        appointment1 = app;
    }
    public NonCitizens(String na, String em, String pno, String add, String passport, Appointment2 app)
    {
        super(na,em,pno,add);
        PassportNo = passport;
        appointment2 = app;
    }
    //Getter
    public String getPassportNo() {return PassportNo;}
    public Appointment getAppointment1() {return appointment1;}
    public Appointment getAppointment2() {return appointment2;}
    //Setter
    public void setAppointment1(Appointment1 app)
    {
        appointment1 = app;
    }
    public void setAppointment1(Appointment2 app)
    {
        appointment2 = app;
    }
    //toString Method
    public String toString()
    {
        return super.toString() + ";" + PassportNo;
    }
    public String toString1()
    {
        return super.toString1();
    }
    public String toString2()
    {
        return super.toString2() + ";" + PassportNo + ";" + appointment2;
    }
}
