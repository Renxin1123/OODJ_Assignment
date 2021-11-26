/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class Vaccine_Dose1 extends Vaccine{
    private String dose;
    //Constructor
    public Vaccine_Dose1() {}
    public Vaccine_Dose1(String na, String ba)
    {
        super(na,ba);
        dose = "1";
    }
    public String toString()
    {
        return super.toString() + ";" + dose;
    }
    public String getDose()
    {
        return dose;
    }
}
