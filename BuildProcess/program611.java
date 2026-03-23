// Unpacking code

import java.io.*;
import java.net.FileNameMap;
import java.nio.file.Files;
import java.util.*;

import javax.imageio.stream.FileImageInputStream;


class program611
{
    public static void main(String A[]) throws Exception
    {
        // Variable creation
        int FileSize = 0;
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        byte bHeader[] = new byte[100];
        byte Buffer[] = null;
        String Header = null;
        sobj = new Scanner(System.in);
        String Tokens[] = null;
        File fobj = null;


        System.out.println("Enter the name packed file : ");
        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if(fpackobj.exists() == false)
        {   
            System.out.println("Error  : There is no such packed file");
            return;
        }
        
        fiobj = new FileInputStream(fpackobj);

        // Read  the header
        fiobj.read(bHeader,0,100);

        Header = new String(bHeader);

        Header = Header.trim();

        Tokens = Header.split(" ");

        System.out.println("FileName : "+Tokens[0]);
        System.out.println("File size : "+Tokens[1]);

        
        fobj  = new File(Tokens[0]);
        
        fobj.createNewFile();

        foobj = new FileOutputStream(fobj);

        FileSize = Integer.parseInt(Tokens[1]);

        Buffer = new byte[FileSize];

        fiobj.read(Buffer,0, FileSize);

        foobj.write(Buffer,0,FileSize);
    }
}