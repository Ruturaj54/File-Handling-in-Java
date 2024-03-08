
//To display the File names from the directory and its size also

import java.util.*;
import java.io.*; //File handling things

class ProgramFS13
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
                System.out.println("File Name : " +Arr[i].getName() +" File Size : "+Arr[i].length() +"Can Read : "+Arr[i].canRead() +" CanWrite : "+Arr[i].canWrite());
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }
        
        sobj.close();
    }
}