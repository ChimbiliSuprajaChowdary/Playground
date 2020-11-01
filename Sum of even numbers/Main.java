import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr1[]=new int[n];
    for(int i=0;i<n;i++)
      arr1[i]=sc.nextInt();
    int sum=0;
      for(int i=0;i<n;i++)
      {
        if(arr1[i]%2==0)
          sum+=arr1[i];
      }
    System.out.print("The sum of the even numbers in the array is "+sum);
  }
}