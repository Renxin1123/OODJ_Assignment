/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class Appointment2 extends Appointment1{
    private String dose2;
    private String AppointmentDate2;
    private String AppointmentTime2;
    private Vaccination_Center vacCenter;
    public Appointment2(String date1, String time1)
    {
        super(date1,time1);
        dose2= "2";
        vacCenter = new Vaccination_Center(null,null,null,null,null);
    }
    public Appointment2(String date1, String time1, Vaccination_Center center, String date2, String time2)
    {
        super(date1,time1,center);
        AppointmentDate2 = date2;
        AppointmentTime2 = time2;
        dose2= "2";
        vacCenter = new Vaccination_Center(null,null,null,null,null);
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
        return super.toString2() + ";" + dose2 + ";" + AppointmentDate2 + ";" +  AppointmentTime2 + ";" + vacCenter;
    }
}
