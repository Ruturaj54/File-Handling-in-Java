// this file will append the data not the overwrite the data
// this method that is FileOutputstream is more powerfull because this can write any kind of data like audio,txt,etc


import java.util.*;
import java.io.*; //File handling things

class ProgramFS6
{

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file in which you want to write data : ");
        String FileName = sobj.nextLine();

        try
        {   
            System.out.println("Enter the Data here you want to insert in file : ");
            String Data = sobj.nextLine();

            FileOutputStream fobj = new FileOutputStream(FileName,true); //chipkun

            byte arr[] = Data.getBytes();

            fobj.write(arr);
            fobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured "+obj);
        }


        sobj.close();

    }
}