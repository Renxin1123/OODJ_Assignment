/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FileOperation implements java.io.Serializable{
    //constructor
    public FileOperation(){}
    
    // Write objects to Text File
    public void Write2File(String file, Object obj)
    {
        try
        {
            File F1 = new File(file);
            FileWriter fw = new FileWriter(F1,true);
             
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(obj.toString());
            pw.close();
            /*FileOutputStream fos = new FileOutputStream(F1);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(ob);
            out.close();*/
            System.out.println("Data Written Successfully");
        }
        catch(IOException Ex)
        {
            System.out.println("Some IO issues Data Not Written....");
        }
    }
    
    // Read from file
    public void ReadfromFile(String file)
    {
        try
        {
            File F1 = new File(file);
            Scanner Sc = new Scanner(F1);
            while(Sc.hasNextLine())
            {
                String Line = Sc.nextLine();
                String[] Arr = Line.split(";");
                //write to jtable
            }
        }
        catch(FileNotFoundException ex)
        {
            
        }
    }
    
    public void ModifyTextFile(String file, int SelRow, Object obj)
    {
        ArrayList<String> AList = new ArrayList<String>();
        try
        {
            File F1 = new File(file);
            Scanner Sc = new Scanner(F1);
            while(Sc.hasNext())
            {
                //ArrayList
                AList.add(Sc.next());
                System.out.println(AList.toString());
            }
        }
        catch(FileNotFoundException ex)
        {
            
        }
        AList.set(SelRow, obj.toString());
        System.out.println(AList.toString());   
        
        /*for(int i = 0; i <  AList.size(); i++)  
            {
                Object[] temp = new Object[100];
                temp[i] = AList.get(i).toString();
                System.out.println(temp[i]);
            }*/
   
        try
        {
            File F1 = new File(file);
            FileWriter fw = new FileWriter(F1,false);
            for(String str: AList)
            {
                fw.write(str + System.lineSeparator());
            }
            fw.close();
            
            System.out.println("Data Modified Successfully");
           
        }
        catch(IOException Ex)
        {
        
        }
    }
    
    //Remove object from text file
    public void RemoveFromTextFile(String file, int SelRow)
    {
        ArrayList<String> AList = new ArrayList<String>();
        try
        {
            File F1 = new File(file);
            Scanner Sc = new Scanner(F1);
            while(Sc.hasNext())
            {
                //ArrayList
                AList.add(Sc.next());
                System.out.println(AList.toString());
            }
        }
        catch(FileNotFoundException ex)
        {
            
        }
        
        AList.remove(SelRow);
        
        try
        {
            File F1 = new File(file);
            FileWriter fw = new FileWriter(F1,false);
            for(String str: AList)
            {
                fw.write(str + System.lineSeparator());
            }
            fw.close();
            
            System.out.println("Data Modified Successfully");
           
        }
        catch(IOException Ex)
        {
        
        }
    }
    
    // Write object to ser file
    public void Write2SerFile(String file1, Person obj)
    {
        //File F1 = new File(file);
        ArrayList<Object> AList = new ArrayList<Object>();
        Person[] myUsers = new Person[100];
        int counter = 0;
        File file = new File("LoginDetails");
        boolean stat = true;
        
        try
        {
           FileInputStream f1 = new FileInputStream(file);
           ObjectInputStream O1 = new ObjectInputStream(f1);
           while(stat == true)
           {
               Person Temp = new Person();
               
               try
               {
                   Temp = (Person)O1.readObject();
               }
               catch(ClassNotFoundException Ex)
               {
                   
               }
               
               if(Temp!=null)
               {
                   myUsers[counter] = Temp;
                   counter++;
                   System.out.println(counter);
               }
               else
               {
                   stat = false;
               }
           }
           O1.close();
       }
       catch(IOException Ex)
       {
           
       }
       finally
       {
           System.out.println("List of Objects that are Deserialized: ");
           for(int i = 0; i < counter; i++)
           {
               System.out.println(myUsers[i].toString());
               AList.add(myUsers[i]);
               System.out.println(AList.toString());
           }
       } 
        
       AList.add(obj); 
       System.out.println(AList); 
       for(Object object: AList)
       {
           System.out.println(object);
       }  //normal
       
        try
        {
            FileOutputStream fos = new FileOutputStream("LoginDetails");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(AList);
            oos.close();
            fos.close();
            //System.out.println("Successfully");
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
       /*try
        {
            FileOutputStream fos = new FileOutputStream(file,true);
            ObjectOutputStream out = new ObjectOutputStream(fos);/*{
                protected void writeStreamHeader() throws IOException{
                    super.writeStreamHeader();
                }
            };
            out.writeObject(AList);
            //out.writeObject(obj);
            System.out.println("UserData written Successfully");
            //out.flush();
            out.close();
            fos.close();
        }
        catch(IOException Ex)
        {
            
        }*/
        
        /*try
        {
            FileOutputStream fos = new FileOutputStream(F1);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(obj);
            out.close();
            fos.close();
            System.out.println("Object written successfully");
        }
        catch(IOException Ex)
        {
            System.out.println("File error" + Ex.getMessage());
        }
        */
        /*File F1 = new File(file1);   //can't see the file, it is not readable in java as plaintext
        try
        {
            
            FileOutputStream fos = new FileOutputStream(F1);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(obj);
            System.out.println("UserData written Successfully");
            out.close();
            fos.close();
        }
        catch(IOException Ex)
        {
            
        }*/
    }
    
    //Read Object from file  //deserialization
    public void ReadfromSerFile(String file)               //error
    { 
        Person[] Demo = new Person[100];
        int Counter = 0;
        File F1 = new File(file);
        
        try
        {
            boolean Stat = true;
            //Reading the object from a file
            FileInputStream fis = new FileInputStream(F1);
            ObjectInputStream in = new ObjectInputStream(fis);
            
            while(Stat)
            {
                Person Temp = new Person();
                //Method for deserialization of object
                //Citizens Citizens_Temp = new Citizens();
                //NonCitizens Non_Temp = new NonCitizens();
                try
                {
                    Temp = (Person)in.readObject();
                    //Non_Temp = (NonCitizens)in.readObject();
                }
                catch(ClassNotFoundException Ex)
                {
                    
                }
                if(Temp!=null)
                {
                    Demo[Counter] = Temp;
                    System.out.println(Counter);
                    Counter++;
                }
                else
                {
                    Stat=false;
                }
            }
            in.close();
            fis.close();
        }
       catch(FileNotFoundException e)
       {
          
       }
       catch(IOException e)
       {
          
       }
       finally
       {
           System.out.println("Objects has been deserialized");
       }
    }
    
    /*public void ModifyFile(String file, String oldString, String newString)
    {
        File fileToBeModified = new File(file);
        String oldContent = "";
        //BufferedReader br = null;
        //FileWriter fw = null;
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileToBeModified));
            
            //Reading all the lines of input text file into oldContent
            String line = br.readLine();
            while(line!=null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = br.readLine();
            }
            
            //Replacing oldString with newString in the OldContent
            String newContent = oldContent.replaceAll(oldString, newString);
            
            //Rewriting the input text file with new Content
            FileWriter fw = new FileWriter(fileToBeModified);
            fw.write(newContent);
            
            br.close();
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }*/
}
