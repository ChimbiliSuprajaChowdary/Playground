import java.util.*;
class Main
{
  public static void type(int n,int arr[])
  {
    int e=0,od=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]%2==0)
       e++;
      if(arr[i]%2==1)
        od++;
     }
    if(e==n)
         System.out.print("The array is Even");
     if(od==n)
        System.out.print("The array is Odd");
     if(e!=n && od!=n)
        System.out.print("The array is Mixed");
    
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    type(n,arr);
    
  }
}