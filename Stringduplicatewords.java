/* import java.util.Scanner;
public class Stringduplicatewords{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    String dup[] = new String[words.length];
    
        System.out.println("Number of words: "+words.length);
        for(int i=0;i<words.length;i++) {
          for(int j=i+1;j<words.length;j++){
            if(words[i].equals(words[j])){
              dup[i]=words[j];
          }
   }
        System.out.println(words[i]);
  }
    System.out.println("Duplicate strings are : ");
    for(int i=0;i<dup.length;i++){
      if(dup[i]==null){
        //null values
      }
      else{
      System.out.println(dup[i]);
    }
    }
}
}  */