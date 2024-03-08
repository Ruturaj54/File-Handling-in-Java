//Createing the File for user

import java.util.*;
import java.io.*; //File handling things

class ProgramFS1
{

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        try{
                File fobj = new File(FileName); //java has File class from which we create the object of that fileclass

                boolean bRet = false;
                bRet = fobj.createNewFile();
                if(bRet == true)
                {
                    System.out.println("File Gets Successfully created..");
                }
                else
                {
                    System.out.println("unable to create the File...");
                }
        }catch(IOException eobj)
        {
            System.out.println("Exception Occured "+eobj);
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}