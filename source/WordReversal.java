//Version 3

import java.util.Scanner;
import java.lang.StringBuilder;
public class WordReversal
{
 
       public static void main (String[] args)
       {
             Scanner sc= new Scanner(System.in); //System.in is a standard input stream
             System.out.print("Enter a string:");
             String str=sc.nextLine(); //reads String
             System.out.println("The word to be reversed is: "+ str);
             String reversed=new String("");

            for(int i=str.length()-1, j= 0; i>=0 && j<=str.length() ;i--,j++){
               

               reversed=reversed+String.valueOf(str.charAt(i));
            system.out.println("GUIBranch")
            }
             System.out.println("The reversed version is: "+reversed);
                
       }
}