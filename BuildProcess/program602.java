import java.io.*;
import java.util.*;


class program601
{
    public static void main(String A[]) throws Exception
    {
        String str = "A.txt 10";

        String Arr[] = str.split(" ");

        System.out.println(Arr.length);

        for(int i =0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        File fobj = new File(Arr[0]);

        fobj.createNewFile();

        int size = Integer.parseInt(Arr[1]);

        System.out.println(size);
    }
}