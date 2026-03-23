import java.io.*;
import java.util.*;

class program558
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File  fobj = new File(FileName);

        boolean bRet = fobj.createNewFile();

        if(bRet == true)
        {
            System.out.println("File gets created sucessfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }

        sobj.close();
     }
}