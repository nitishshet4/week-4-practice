/* import java.util.Scanner;

public class vowelcon {

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    System.out.println("enter the string");
    int vcount=0;
    int ccount=0;
    String n=s.nextLine();
      String ns=n.toLowerCase();
    String  word[]=ns.split(" ");
    char  arr[]=word.length();
    // String ns=n.toLowerCase();
    for(int  i=0;i<arr.length();i++){
     // char c=word.charAt(i);

      if((arr.charAt(i)=='a') || arr.charAt(i)=='e'
        || arr.charAt(i)=='i'||arr.charAt(i)=='o'
        arr.charAt(i)=='u'){
        vcount++;
        }
      else{
        ccount++;
      }
      System.out.println("the consonants counts are :" +ccount);
      System.out.println("the vowels counts are :" +vcount);
    }
  }
      }
      
      
    }   */
  