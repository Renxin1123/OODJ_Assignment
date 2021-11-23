/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class NonCitizens extends People implements java.io.Serializable{
    private String PassportNo;
    //Constructor
    public NonCitizens() {}
    public NonCitizens(String na, String un, String pw, String em, String pno, String add, String passport)
    {
        super(na,un,pw,em,pno,add);
        PassportNo = passport;
    }
    //Getter
    public String getPassportNo() {return PassportNo;}
    //toString Method
    public String toString()
    {
        return super.toString() + ";" + PassportNo;
    }
}
