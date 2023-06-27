/* import java.util.Scanner;
public class Stringcount{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string");
  String str=sc.nextLine();
  int acount=0,ocount=0,dcount=0,scount=0;
    for(int i=0;i<str.length();i++) {
                   
if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
                       acount++;
                   }
                   else if(str.charAt(i)==' '){
                       ocount++;
                   }
                    else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                       dcount++;
                   }
                   else {
                       scount++;
                   }
                   }
   System.out.println("Count of alphabets are : "+acount);
   System.out.println("Count of spaces are : "+ocount);
   System.out.println("Count of digits are : "+dcount);
   System.out.println("Count of Special characters are : "+scount);             
}
} */