import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=3,b=8,sum=0;
      System.out.print(a+" "+b+" ");
      for(int i=2;i<n;i++)
      {
        sum=a+b+i;
        a=b;
        b=sum;
        System.out.print(sum+" ");
      }
	}
}