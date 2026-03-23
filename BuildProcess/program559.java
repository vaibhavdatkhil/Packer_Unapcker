import java.io.*;
import java.util.*;

class program559
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        File  fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        bRet = fobj.exists();

        if(bRet ==  true)
        {
            System.out.println("File is already present");
        }
        else
        {
            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File gets created sucessfully");
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }

        sobj.close();
     }
}