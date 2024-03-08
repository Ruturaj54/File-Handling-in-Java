//************Demonstration of Replace Activity**************

import java.util.*;

class Programtrim
{
    public static void main(String[] Args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "Hello World";

        Str = Str.replaceAll("l","_");

        System.out.println(Str);
        
        sobj.close();
    }

}
