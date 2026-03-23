import java.io.*;
import java.util.*;

class program582

{
    public static void main(String A[]) throws Exception
    {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && (fobj.isDirectory()))
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(int i = 0; i < fArr.length;i++)
            {
                System.out.println("File Name : "+fArr[i].getName());
                System.out.println("File Size : "+fArr[i].length());
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
     }
}