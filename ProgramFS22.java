//********* Program for Unpacker *********

import java.util.*;
import java.io.*;

class ProgramFS22
{
    public static void main(String Args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Packed File that you want to unpack : ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);
        FileInputStream fiobj = new FileInputStream(fobj);

        byte Header[] = new byte[100];
        fiobj.read(Header,0,100); //Kashat gheichay,index kay,length kiti

        String Hstr =  new String(Header);
        // System.out.println(Hstr);
        
        String Str = Hstr.trim();

        String Tokens [] = Str.split(" ");
        // System.out.println("Name of File is : "+Tokens[0]);
        // System.out.println("Size of File is : "+Tokens[1]);

        File NewFile = new File(Tokens[0]);
        NewFile.createNewFile();

        int FileSize = Integer.parseInt(Tokens[1]); //converted string to integer

        byte Buffer[] = new byte[FileSize];
        fiobj.read(Buffer,0,FileSize);

        FileOutputStream foobj = new FileOutputStream(NewFile);
        foobj.write(Buffer,0,FileSize);
    
    }
}