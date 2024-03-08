//Displaying all the info of the file

import java.util.*;
import java.io.*; //File handling things

class ProgramFS3
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
            if(bRet)   //if(bRet == true)
            {
                System.out.println("Name of File is : "+fobj.getName());
                System.out.println("Absolute path of file is : "+fobj.getAbsolutePath());
                System.out.println("File Size is : "+fobj.length());
                System.out.println("We can read from file "+fobj.canRead());
                System.out.println("We can Write from file "+fobj.canWrite());

            }
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}