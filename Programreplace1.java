//************Demonstration of Replace Activity**************

import java.util.*;

class Programreplace1
{
    public static void main(String[] Args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "     Hello   World  Demo     ";

        Str = Str.replaceAll(" ","");

        System.out.println(Str);
        
        sobj.close();
    }

}
