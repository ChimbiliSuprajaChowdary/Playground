import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr1[]=new int[n];
      for(int i=0;i<n;i++)
         arr1[i]=sc.nextInt();
       int arr2[]=new int[n];
      for(int i=0;i<n;i++)
         arr2[i]=sc.nextInt();
      int sum1=0,sum2=0;
      for(int i=0;i<n;i++)
      {
        System.out.println(arr1[i]+arr2[i]);
      }
      
    }
}