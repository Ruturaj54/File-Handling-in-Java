//************Demonstration of trim it and Replace  Activity**************

import java.util.*;

class ProgramString
{
    public static void main(String[] Args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        Str = Str.trim();

        System.out.println("After Trim : "+Str);

        Str = Str.replaceAll(" ","");
        System.out.println("After ReplaceAll : "+Str);

        
        sobj.close();
    }

}
