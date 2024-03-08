//To is present the directory

import java.util.*;
import java.io.*; //File handling things

class ProgramFS9
{

    public static void main(String Args[]) throws Exception
    {   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Name of Directory : ");
        String DirectoryName = sobj.nextLine();

        boolean bRet = false;
        File fobj = new File(DirectoryName);

        bRet = fobj.isDirectory();
        if(bRet == true)
        {
            System.out.println("Directory is Present");
        }
        else
        {
            System.out.println("There is no such directory");
        }
        
        sobj.close();
    }
}