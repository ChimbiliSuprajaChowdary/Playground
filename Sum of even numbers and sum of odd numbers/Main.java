import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int arr[]=new int[t];
    int esum=0,osum=0;
    for(int i=0;i<t;i++)
    {
      arr[i]=sc.nextInt();
      if(arr[i]%2==0)
        esum+=arr[i];
      else
        osum+=arr[i];
     }
    System.out.println("The sum of the even numbers in the array is "+esum);
    System.out.println("The sum of the odd numbers in the array is "+osum);

  }
}