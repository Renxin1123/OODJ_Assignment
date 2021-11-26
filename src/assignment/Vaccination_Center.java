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
    public Vaccination_Center(String code, String na, String add, String va, String ba)
    {
        centerCode = code;
        name = na;
        address = add;
        vaccines = new Vaccines(va,ba);  
        //vaccine2 = new Vaccine_Dose2(va,ba);  
    }
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
    public void addCenter()  //method is called in assigment main class
    {
        Vaccination_Center center1 = new Vaccination_Center("001","Stadium_Bukit_Jalil","Jalan_Barat","Phizer","BC007"); 
        Vaccination_Center center2 = new Vaccination_Center("002","AMC_Medical_Clinic","Jalan_S2","Sinovac","BC011"); 
        /*ArrayList<Vaccination_Center> CenterList = new ArrayList<Vaccination_Center>();
        CenterList.add(center1);
        CenterList.add(center2);*/
        Vaccination_Center[] CenterList = new Vaccination_Center[10];
        CenterList[0] = center1;
        CenterList[1] = center2;
        
        
        FileOperation Fop = new FileOperation();
        Fop.Write2File("Vaccination_Center.txt", center1.toString());
        Fop.Write2File("Vaccination_Center.txt", center2.toString());
    }
    
}
