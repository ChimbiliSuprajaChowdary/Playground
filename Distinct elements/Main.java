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
    int c=n;
    for(int i=0;i<n;i++){
     
      for(int j=i+1;j<n;j++)
      {
        boolean com=true;
        if(arr1[i]==arr1[j]){
         c--;
        break;
        }
        
      }
    }
    System.out.print(c);
        
  }
}