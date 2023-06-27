/* import java.util.Scanner;
class S1
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array length");
      int len=s.nextInt();
      int a[]=new int[len];
      for(int i=0;i<len;i++)
        {
          System.out.println("Enter the array elements");
          a[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<len;i++)//0 0 3 4 5
          {
            for(int j=i+1;j<len;j++)//1 3 4 5
              {
                if(a[i]==a[j])
                {
                  count++;//1
                  a[j]= 0;
                  a[i]= 0;
                }
              }
          }
       for(int i=0;i<len;i++)
         {
       if(count==0 && a[i]!=0)
            {
              System.out.println(a[i]);
            }
    }
  }
  } */ 