//Is file Exixts or not we are checking

import java.util.*;
import java.io.*; //File handling things

class ProgramFS2
{

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        try
        {
            File fobj = new File(FileName); //java has File class from which we create the object of that fileclass

            boolean bRet = false;

            bRet = fobj.exists();
            if(bRet == true)
            {
                System.out.println("File is Present...");
            }
            else
            {
                System.out.println("There is no such file...");
            }
                
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}