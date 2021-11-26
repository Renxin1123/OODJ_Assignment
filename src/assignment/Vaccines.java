/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author user
 */
public class Vaccines {
    private String name;
    private String batch;
    //Constructor
    public Vaccines() {}
    public Vaccines(String na, String ba)
    {
        name = na;
        batch = ba;
    }
    public String toString()
    {
        return name + ";" + batch;
    }
    //public String getDose();
}
