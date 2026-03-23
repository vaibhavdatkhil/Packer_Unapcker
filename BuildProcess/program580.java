import java.io.*;
import java.util.*;

class program578
{
    public static void main(String A[]) throws Exception
    {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Folder is present");
        }
        else
        {
            System.out.println("There is no such folder");
        }
     }
}