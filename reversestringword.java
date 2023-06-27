/* import java.util.*;
public class reversestringword
{
    public static void main(String[] args) {
        //Hi Hello How are you ---Input 
        //iH olleH woH era uoy ---output
        //arrays,controll statements, loops, datatypes
        
        
        String str="hello madar how are you"; //charAt(1);   
               
               
           String[] arr=str.split(" ");
           // 0      1    index
           // Hello madar
           // 1       2    length
           //for(int i=0;i<arr.length)
           
           for(String word: arr){
               // word=hello
               for(int i=word.length()-1;i>=0;i--){
                   System.out.print(word.charAt(i));
               }
               System.out.print(" ");
               
           }  
          
    }
} */