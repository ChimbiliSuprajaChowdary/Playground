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
      int key=sc.nextInt();
      boolean com=false;
      for(int i=0;i<n;i++)
      {
        if(arr1[i]==key){
          System.out.print(key+" is present in the array");
          com=true;
          break;
        }
      }
      if(com==false)
      System.out.print(key+" is not present in the array");
    }
}