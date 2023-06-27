/* import java.util.Scanner;

public  class Empty{

  public static  void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the number:");
    int n=s.nextInt();
    int []  arr=new int[n];
     System.out.println("enter the" +n  "elements: " );
    for(int i=0;i<arr.length;i++)
    {
    //  System.out.println("enter the" +n  "elements:" );
    arr[i]=s.nextInt();
    }
    int temp=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        if(arr[i]<arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
     System.out.println("highest element  "  +arr[n-1]);
        
          System.out.println("lowest  element  " +arr[0]);
  }
}   */