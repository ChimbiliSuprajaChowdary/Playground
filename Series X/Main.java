import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=2;
      System.out.print("2 ");
      for(int i=1;i<n;i++)
      {
        a=(a*a)-1;
        System.out.print(a+" ");
	  }
    }
}