import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      double a=95.0,b=0;
      System.out.print(a+" ");
      for(int i=1;i<n;i++)
      {
        a+=20.5+b;
        System.out.print(a+" ");
        b+=2;
      }
	}
}