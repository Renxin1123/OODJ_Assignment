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

public class FileOperation {
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
        
        for(int i = 0; i <  AList.size(); i++)  
            {
                Object[] temp = new Object[100];
                temp[i] = AList.get(i).toString();
                System.out.println(temp[i]);
            }
   
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
    public void Write2SerFile(String file, Object obj)
    {
        File F1 = new File(file);
        
        try
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
    }
    
    //Read Object from file  //deserialization
    public void ReadfromSerFile(String file, String Class)               //error
    { 
        Object[] Demo = new Object[10];
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
                //Method for deserialization of object
                Citizens Citizens_Temp = new Citizens();
                NonCitizens Non_Temp = new NonCitizens();
                try
                {
                    Citizens_Temp = (Citizens)in.readObject();
                    Non_Temp = (NonCitizens)in.readObject();
                }
                catch(ClassNotFoundException Ex)
                {
                    
                }
                if(Citizens_Temp!=null && Non_Temp!=null)
                {
                    Demo[Counter] = Citizens_Temp;
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
