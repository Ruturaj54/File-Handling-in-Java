
//Packing the File ....********************


import java.util.*;
import java.io.*; //File handling things

class ProgramFS20
{

    public static void main(String Args[]) throws Exception
    {   
        System.out.println("-----------------------------------------------------------");
        System.out.println("----------------Marvellous Packer Unpacker------------------");
        System.out.println("-----------------------------------------------------------");
        
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

            FileOutputStream fcombine = new FileOutputStream(PackedFile);
            
            int iRet = 0;
            byte Buffer[] = new byte[1024];

            System.out.println("Packing Activity Started");
            //Travel Directory
            for(int i = 0;i < Arr.length;i++)
            {
                //Createdd header
                Header = Arr[i].getName() + " " + Arr[i].length();
                
                //Add Extra White spaces at the end of header
                for(int j = Header.length();j < 100;j++)
                {
                    Header = Header + " ";
                }
                //Convery string header into bytes
               byte hArr[] = Header.getBytes();

               //write header into packed file
               fcombine.write(hArr,0,100);

               FileInputStream fiobj = new FileInputStream(Arr[i]);

                while ((iRet = fiobj.read(Buffer)) != -1) 
                {
                    fcombine.write(Buffer,0,iRet);   
                }
                fiobj.close();
            }
            fcombine.close();
            System.out.println("Packing Activity Completed");
            System.out.println("Total Files Packed Sucessfully : "+Arr.length);
            System.out.println("---------------------------------------------------------------");
            System.out.println(".....Thankyou for using marvellous File Packer and Unpacker....");
            System.out.println("---------------------------------------------------------------");

            
        }
        else
        {
            System.out.println("There is no such directory");
        }
        
        sobj.close();
    }
}