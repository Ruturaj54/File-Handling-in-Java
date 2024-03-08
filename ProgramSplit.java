//************Demonstration of trim Activity**************

import java.util.*;

class ProgramSplit 
{
    public static void main(String[] Args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "     Hello     ";
        
        System.out.println("Length of Str is : "+Str.length());
        
        Str = Str.trim();

        System.out.println("Length of Final Str is : "+Str.length());
        sobj.close();
    }

}
