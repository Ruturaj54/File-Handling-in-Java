//Write the data into file

import java.util.*;
import java.io.*; //File handling things

class ProgramFS4
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

            FileWriter fobj = new FileWriter(FileName);
            fobj.write(Data);
            fobj.close();

        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}