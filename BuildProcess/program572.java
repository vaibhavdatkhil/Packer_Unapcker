import java.io.*;
import java.util.*;

class program572
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

         File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[50];

            fiobj.read(Arr);

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