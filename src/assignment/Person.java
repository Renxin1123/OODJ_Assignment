/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Person implements java.io.Serializable{
    protected String Name;
    protected String Username;
    protected String Password;
    protected String Role;
    //Constructor
    public Person() {}
    public Person(String na)
    {
        Name = na;
    }
    public Person(String na, String un, String pw)
    {
        Name = na;
        Username = un;
        Password = pw;
    }
    public Person(String na, String un, String pw, String role)
    {
        Name = na;
        Username = un;
        Password = pw;
        Role = role;
    }
    //Getter
    public String getName() {return Name;}
    public String getUsername() {return Username;}
    public String getPassword() {return Password;}
    public String getRole() {return Role;}
    //toString method
    public String toString()
    {
        return Name + ";" + Username + ";" + Password;
    }
    public String toString1()
    {
        return Name;
    }
    public String toString2()
    {
        return Name + ";" + Username + ";" + Password + ";" + Role;
    }
}
