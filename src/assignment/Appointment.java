/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


abstract public class Appointment {
    protected String AppointmentDate;
    protected String AppointmentTime;
    //protected String dose;
    //private Vaccination_Center vacCenter;
    //Constructor
    public Appointment(String date, String time)
    {
        AppointmentDate = date;
        AppointmentTime = time;
        //dose = dos;
    }
    //public Appointment() {}
    /*public Appointment(String date, String time)
    {
        AppointmentDate = date;
        AppointmentTime = time;
        //vacCenter = new Vaccination_Center(null,null,null,null,null);
    }*/
    //Getter
    abstract public Vaccination_Center getVacCenter();
    public String getAppointmentDate() {return AppointmentDate;}
    public String getAppointmentTime() {return AppointmentTime;}


    //Setter
    abstract public void setVacCenter(Vaccination_Center center);
 
    //toString Method
    public String toString()
    {
        return AppointmentDate + ";" + AppointmentTime;
    }
}
