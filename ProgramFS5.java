//Write the data into file 
//this file overwrites the data

import java.util.*;
import java.io.*; //File handling things

class ProgramFS5
{

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file in which you want to write data : ");
        String FileName = sobj.nextLine();

        try
        {   
            System.out.println("Enter the Data here you want to insert in file : ");
            String Data = sobj.nextLine();

            FileOutputStream fobj = new FileOutputStream(FileName);

            byte arr[] = Data.getBytes();

            fobj.write(arr);
            fobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}