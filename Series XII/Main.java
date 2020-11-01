import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=9,b=11,sum;
      System.out.print(a+" "+b+" ");
      for(int i=3;i<=n;i++)
      {
        sum=a+b;
        System.out.print(sum+" ");
        a=b;
        b=sum;
      }
	}
}