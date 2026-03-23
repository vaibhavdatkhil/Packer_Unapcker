// Unpacking code

import java.io.*;
import java.net.FileNameMap;
import java.util.*;

import javax.imageio.stream.FileImageInputStream;


class program608
{
    public static void main(String A[]) throws Exception
    {
        // Variable creation
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        byte bHeader[] = new byte[100];
        String Header = null;
        sobj = new Scanner(System.in);

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

        System.out.println("Header : "+Header);

    }
}