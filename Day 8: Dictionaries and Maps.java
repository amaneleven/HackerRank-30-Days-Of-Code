//WRITING CODE FROM SCRATCH........... DELETE ALL EXISTING CODE IN THE EDITIOR AND WRTIE THIS CODE DIRECTLY.
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int n,i,phone;
        String name,search;
         n=sc.nextInt();
         HashMap<String , Integer> map =new HashMap();
         for(i=0;i<n;i++){
             name=sc.next();
             phone=sc.nextInt();
             map.put(name,phone);
         }
         
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
      
         while(sc.hasNext()){
             search=sc.next();
             if(map.containsKey(search)){
                 System.out.println(search+"=" +map.get(search));
             }
             else{
                 System.out.println("Not found");
             }
         }  
        
        
    }
}
