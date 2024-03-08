
//Packing the File ....********************


import java.util.*;
import java.io.*; //File handling things

class ProgramFS15
{

    public static void main(String Args[]) throws Exception
    {   
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Name of Directory : ");
        String DirectoryName = sobj.nextLine();

        System.out.println("Enter the name of Packed file that you want to create..");
        String PackedFile = sobj.nextLine();

        File fobjPack = new File(PackedFile);

        bRet = fobjPack.createNewFile();

        if(bRet == false)
        {
            System.out.println("Unable to create the packed file...");
            return;
        }

        
        File fobj = new File(DirectoryName);

        bRet = fobj.isDirectory();
        if(bRet == true)
        {
            System.out.println("Directory is Present");

            File Arr[] = fobj.listFiles(); //used to count the files in the folder
            System.out.println("Number of Files in the directory are : "+Arr.length);

            String Header = null;

            for(int i = 0;i < Arr.length;i++)
            {
                Header = Arr[i].getName() + " " + Arr[i].length();
                System.out.println(Header);
            }
            
        }
        else
        {
            System.out.println("There is no such directory");
        }
        
        sobj.close();
    }
}