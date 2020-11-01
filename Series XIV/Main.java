import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=2,b=5,sum=0;
      System.out.print(a+" "+b+" ");
      for(int i=3;i<=n;i++)
      {
        sum=b+(b-a)*2;
        System.out.print(sum+" ");
        a=b;
        b=sum;
      }
      
	}
}