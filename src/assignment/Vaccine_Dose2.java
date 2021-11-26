/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class Vaccine_Dose2 extends Vaccine{
    private String dose;
    //Constructor
    public Vaccine_Dose2() {}
    public Vaccine_Dose2(String na, String ba)
    {
        super(na,ba);
        dose = "2";
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
