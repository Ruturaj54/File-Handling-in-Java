

import java.util.*;
import java.io.*; //File handling things

class ProgramFS8
{

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file in which you want to write data : ");
        String FileName = sobj.nextLine();

        try
        {   
           
            FileInputStream fobj = new FileInputStream(FileName); 
            byte Arr[] = new byte[100];

            fobj.read(Arr); 
            String str = new String(Arr);

            System.out.println(str);

            
            fobj.close();
        }
        catch(IOException obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}