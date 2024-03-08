import java.util.*;
import java.io.*;

class ProgramFS23
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("<------------------------------------------------------------->");
        System.out.println("<----------------Marvellous Packer Unpacker------------------->");
        System.out.println("<------------------------------------------------------------->");
        int iCount = 0;
        byte Header[] = new byte[100];
        int FileSize = 0;
        String str = null;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file that you want to unpack : ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);
        FileInputStream fiobj = new FileInputStream(fobj);

        while((iRet = fiobj.read(Header, 0, 100))>0)
        {
            String Hstr = new String(Header);

            str = Hstr.trim();
            String Tokens[] = str.split(" ");

            File NewFile = new File(Tokens[0]);
            NewFile.createNewFile();

            FileSize = Integer.parseInt(Tokens[1]);

            byte Buffer[] = new byte[FileSize];
            fiobj.read(Buffer,0,FileSize);

            FileOutputStream foobj = new FileOutputStream(NewFile);
            foobj.write(Buffer,0,FileSize);
            System.out.println("");
            System.out.println(Tokens[0] +" Unpacked SucessFully");
            System.out.println("-------------------------------------");
            iCount++;
        }
            System.out.println("UnPacking Activity Completed");
            System.out.println("Total Files Unpacked Sucessfully : "+iCount);
            System.out.println("<<<<<--------------------------------------------------------------->>>>>");
            System.out.println("<<.....Thankyou for using marvellous File Packer and Unpacker....>>");
            System.out.println("<<<<<--------------------------------------------------------------->>>>>");


        
    }
}