import java.io.*;
import java.util.*;

class program586
{
    public static void main(String A[]) throws Exception
    {
       int No = 21;
       int Ans = 0;

       Ans = No ^ 11;

       System.out.println("Encrypted data : "+Ans);

       Ans = Ans ^ 11;

       System.out.println("Decrypted data : "+Ans);

    }
}