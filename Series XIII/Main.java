import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=5,c=1;
      System.out.print(a+" ");
      for(int i=1;i<n;i++)
      {
       
        a+=(c*11);
        c+=2;
          System.out.print(a+" ");
        
      }
	}
}