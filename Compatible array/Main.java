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
      int arr2[]=new int[n];
      for(int i=0;i<n;i++)
         arr2[i]=sc.nextInt();
    boolean com=true;
    for(int i=0;i<n;i++)
    {
      
      if(arr1[i]>=arr2[i])
        com=true;
      else
        com=false;
    }
    if(com==true)
      System.out.print("Compatible");
    else
      System.out.print("Incompatible");
  }
}