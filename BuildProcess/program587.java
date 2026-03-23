import java.io.*;
import java.security.Key;
import java.util.*;

class program587
{
    public static void main(String A[]) throws Exception
    {
       String str = "Hello";

       byte Arr[] = str.getBytes();

       byte key = 0x11;

       System.out.println("Length of Arr is : "+Arr.length);

       System.out.println("Original data : "+str);

       for(int i = 0; i < Arr.length; i++)
       {
            Arr[i] = (byte)(Arr[i]^key);
       }

       String output = new String(Arr);

       System.out.println("Encrypted data : "+output);

    }
}