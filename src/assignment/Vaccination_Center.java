/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;

public class Vaccination_Center {
    private String centerCode;
    private String name;
    private String address;
    private Vaccines vaccines;
    public Vaccination_Center() {}
    public Vaccination_Center(String code, String na, String add)
    {
        centerCode = code;
        name = na;
        address = add;
        vaccines = new Vaccines(null,null);  
    }
    public Vaccination_Center(String code, String na, String add, String va, String ba)
    {
        centerCode = code;
        name = na;
        address = add;
        vaccines = new Vaccines(va,ba);  
    }
    public Vaccination_Center(String code, String na, String add, Vaccines vac)
    {
        centerCode = code;
        name = na;
        address = add;
        vaccines = vac;  
    }
    //toString Method
    public String toString()
    {
        return centerCode + ";" + name + ";" + address + ";" + vaccines;
    }
    //Setter
    public void setCode(String code)
    {
        centerCode = code;
    }
    public void setName(String na)
    {
        name = na;
    }
    public void setAddress(String add)
    {
        address = add;
    }
    public void setVac(Vaccines vac)
    {
        vaccines = vac;
    }
    //Getter
    public String getCode() {return centerCode;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getVaccineName() {return vaccines.getName();}
    public String getVaccineBatch() {return vaccines.getName();}

}
