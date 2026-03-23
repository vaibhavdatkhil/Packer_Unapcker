import java.io.*;
import java.util.*;

class program557
{
    public static void main(String A[]) throws Exception
    {
        File  fobj = new File("Demo.txt");

        boolean bRet = fobj.createNewFile();

        if(bRet == true)
        {
            System.out.println("File gets created sucessfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }

     }
}