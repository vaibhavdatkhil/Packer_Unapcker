import java.io.*;
import java.util.*;

class program560
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
            fobj.delete();
            System.out.println("File gets deleted");
        }
        else
        {
            System.out.println("There is no such file");
        }
            
        sobj.close();
     }
}