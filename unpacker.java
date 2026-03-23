// UNPACKING FINAL CODE
import java.io.*;
import java.util.*;

class program614
{
    public static void main(String A[]) throws Exception
    {
        // Variable Creation
        int FileSize = 0;
        int i = 0;
        int iRet = 0;

        Scanner sobj = null;
        String FileName = null;
        String Header = null;
        String Tokens[] = null;

        File fpackobj = null;
        File fobj = null;
    
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte key = 0x11;
        byte bHeader[] = new byte[100]; 
        byte Buffer[] = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of Packed file: ");
        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if(fpackobj.exists() == false)
        {
            System.out.println("Error : There is no such packed file");
            return;
        }

        fiobj = new FileInputStream(fpackobj);


        while((iRet = fiobj.read(bHeader, 0, 100)) != -1)
        {
            Header = new String(bHeader);

            Header = Header.trim();

            Tokens = Header.split(" ");

            System.out.println("File Name : "+ Tokens[0]);
            System.out.println("File Size : "+ Tokens[1]);

            fobj = new File(Tokens[0]);
            fobj.createNewFile();

            foobj = new FileOutputStream(fobj);

            FileSize = Integer.parseInt(Tokens[1]);

            // Buffer for reading the data
            Buffer = new byte[FileSize];

            // Read from packed file
            fiobj.read(Buffer, 0, FileSize);

            // Decrypt the data
            for(i = 0; i < FileSize; i++)
            {
                Buffer[i] = (byte)(Buffer[i] ^ key); 
            }

            // Write into extracted file
            foobj.write(Buffer, 0, FileSize);
        }

        sobj.close();
    }
}