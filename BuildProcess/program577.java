import java.io.*;
import java.util.*;

class program577
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String str = null;

        File fobjsrc = null;
        File fobjdest = null;

        boolean bRet = false;

        String FileNamesrc = null;
        String FileNamedest = null;

        byte Buffer[] = new byte[1024];
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        FileNamesrc = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        FileNamedest = sobj.nextLine();

        fobjsrc = new File(FileNamesrc);

        if(fobjsrc.exists())
        {   
            fobjdest = new File(FileNamedest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

           while((iRet = fiobj.read(Buffer)) != -1)
           {
               // System.out.println(str);
               foobj.write(Buffer,0,iRet);
           }

           System.out.println("File copy sucessfully");
           fiobj.close();
           foobj.close();

        }
        else 
        {
            System.out.println("There is no source file");
        }

        sobj.close(); 
     }
}