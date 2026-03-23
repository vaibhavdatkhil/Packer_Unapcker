// PACKING FINAL CODE

import java.io.*;
import java.util.*;

class packer
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Header = null;

        int iRet = 0;
        int i = 0, j = 0;

        byte Buffer[] = new byte[1024];

        byte bHeader[] = new byte[100];

        byte key = 0x11;

        String FolderName = null;
        String PackName = null;

        System.out.println("Enter the name of folder: ");
        FolderName = sobj.nextLine();
        
        System.out.println("Enter the name of packed file : ");
        PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File packobj = new File(PackName);
            packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(packobj);
            FileInputStream fiobj = null;

            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of Files in folder are: "+fArr.length);

            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                if(fArr[i].getName().endsWith(".txt"))
                {
                    // Header Formation
                    Header = fArr[i].getName() + " " +fArr[i].length();

                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();
                    
                    // Write header into packed file
                    foobj.write(bHeader, 0, 100);

                    // Read the data from input files from folder
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        // Encryption Logic
                        for(j = 0; j < iRet; j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ key);
                        }

                        // Write the file's data into the packed file
                        foobj.write(Buffer, 0 ,iRet);
                    }
                }
                
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such Folder");
        }

        sobj.close();
    }
}
