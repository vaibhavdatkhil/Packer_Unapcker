import java.io.*;
import java.util.*;

class program573
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        boolean bRet = false;
        String FileName = null;
        byte Arr[] = new byte[100];
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

         File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            iRet = fiobj.read(Arr);

            System.out.println("iRet = "+iRet);
            String str = new String(Arr);
            System.out.println(str);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close(); 
     }
} 