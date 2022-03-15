import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args)
    {
      
      // Replace All  👇👇 with this codes... in hackerrank       
      
      
        Scanner scanner=new Scanner(System.in);
   int N=scanner.nextInt();
     if(N%2==0)
     {
         if(N>=2 && N<=5)
         System.out.print("Not Weird");
         else if(N>=6 && N<=20)
         System.out.print("Weird");
         else
         System.out.print("Not Weird");
       
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
     }   
     else
     System.out.print("Weird");
     scanner.close();
        
        
        
        
    }
}
