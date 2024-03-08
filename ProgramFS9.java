//Open Existing file and copy it in new file

import java.util.*;

import java.io.*; //File handling things

class ProgramFS9
{

    public static void main(String Args[]) throws Exception
    {   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Name of file from which you want to copy the data ie.Source File : ");
        String SourceFile = sobj.nextLine();

         System.out.println("Enter the Name of Destination file that you want to create : ");
        String DestFile = sobj.nextLine();

        File fobj = new File(SourceFile);

        if(! fobj.exists())
        {
            System.out.println("Source file not exists....");
            return;
        }
        File fobj1 = new File(DestFile);
        fobj1.createNewFile();

        FileInputStream fiobj = new FileInputStream(SourceFile);
        FileOutputStream foobj = new FileOutputStream(DestFile);

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        while((iRet = fiobj.read(Buffer)) != -1)
        {
            foobj.write(Buffer,0,iRet); //0th idex pasun data write kara,
        }

        fiobj.close();
        foobj.close();
        sobj.close();

    }
}