/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

abstract public class Vaccine {
    protected String name;
    protected String batch;
    //Constructor
    public Vaccine() {}
    public Vaccine(String na, String ba)
    {
        name = na;
        batch = ba;
    }
    public String toString()
    {
        return name + ";" + batch;
    }
    abstract public String getDose();
}
