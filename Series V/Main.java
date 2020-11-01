import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=7;
      for(int i=0;i<n;i++)
      {
        a=a+4;
        System.out.print(a*a+" ");
      }
	}
}