

import java.util.*;
import java.io.*; //File handling things

class ProgramFS7
{

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file in which you want to write data : ");
        String FileName = sobj.nextLine();

        try
        {   
           
            FileInputStream fobj = new FileInputStream(FileName); 

            int b = fobj.read(); //return value of read is Int thats why
            
            System.out.println((char)b);

            
            fobj.close();
        }
        catch(IOException obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}