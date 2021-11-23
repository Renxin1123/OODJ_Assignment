/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

public class Person {
    protected String Name;
    protected String Username;
    protected String Password;
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
    //Getter
    public String getName() {return Name;}
    public String getUsername() {return Username;}
    public String getPassword() {return Password;}
    //toString method
    public String toString()
    {
        return Name + ";" + Username + ";" + Password;
    }
    public String toString1()
    {
        return Name;
    }
}
