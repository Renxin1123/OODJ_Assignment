/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class Appointment1 extends Appointment{
    private String dose;
    private Vaccination_Center vacCenter;
    public Appointment1(String date, String time)
    {
        super(date,time);
        dose = "1";
        vacCenter = new Vaccination_Center(null,null,null,null,null);
    }
    public Appointment1(String date, String time, Vaccination_Center center)
    {
        super(date,time);
        dose = "1";
        vacCenter = center;
    }

     //Getter
    public Vaccination_Center getVacCenter()
    {
        return vacCenter;
    }
    //Setter
    public void setVacCenter(Vaccination_Center center)
    {
        vacCenter = center;
    }
    //toString Method
    public String toString()
    {
        return dose + ";" + super.toString() + ";" + vacCenter + ";" + "2;" + "null;" + "null;" + "null;" + "null;"+ "null;"+ "null;"+ "null" + "  " ; 
    }
    public String toString1()    //date and time
    {
        return super.toString();
    }
    public String toString2()
    {
        return dose + ";" + super.toString() + ";" + vacCenter; 
    }
}
