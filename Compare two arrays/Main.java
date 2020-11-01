import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    for(int i=0;i<n;i++)
      arr1[i]=sc.nextInt();
    for(int i=0;i<n;i++)
      arr2[i]=sc.nextInt();
    int c=0;
    for(int i=0;i<n;i++){
      if(arr1[i]!=arr2[i]){
        c=1;
        break;
      }
      
    }
    if(c==1)
      System.out.print("No");
    else
      System.out.print("Yes");
  }
}