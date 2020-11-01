import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
   int c=1,p=1,ci=0,pi=0;
    for(int i=0;i<n;i++)
    {
      c=1;
      for(int j=0;j<n;j++)
      {
        if(i!=j && arr[i]==arr[j])
        {
          c++;
          ci=arr[i];
       //   System.out.println("---");
           }
      }
      if(c>p && c!=1){
        p=c;
      pi=ci;
      System.out.println("Mode="+pi);
    }
     }
    if(p==1)
      System.out.println("The mode of the array is none");
  }
}