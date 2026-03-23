import java.io.*;
import java.util.*;

class program585
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        String PackName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File PackObj = new File(PackName);

            PackObj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(PackObj);

            FileInputStream fiobj = null;

            System.out.println("Folder is present"); 

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println("File name : "+fArr[i].getName()+" File size : "+fArr[i].length()+" bytes");
            
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}