import java.io.*;
import java.util.*;


class program595
{
    public static void main(String A[]) throws Exception
    {
        String str = "A.txt 10";

        System.out.println("Data : "+str);
        System.out.println("Length : "+str.length());

        for(int i =str.length(); i < 100; i++)
        {
            str = str + " ";
        }

        System.out.println("Data : "+str);
        System.out.println("Length : "+str.length());

    }
}