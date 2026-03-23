import java.io.*;
import java.util.*;

class program564
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        FileReader frobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();
       
        
        File fobj = new File(FileName);

         
        if(fobj.exists())
        {
            frobj =  new FileReader(FileName);
        }
        else
        {
            System.out.println("There is no such file");
        }

        if(frobj != null)
        {   
            frobj.close();
        }
     }
}