
//To display the File names from the directory

import java.util.*;
import java.io.*; //File handling things

class ProgramFS11
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

            File Arr[] = fobj.listFiles(); //used to count the files in the folder
            System.out.println("Number of Files in the directory are : "+Arr.length);

            for(int i = 0;i < Arr.length;i++)
            {
                System.out.println(Arr[i].getName());
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }
        
        sobj.close();
    }
}