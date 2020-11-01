import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=4;
      for(int i=0;i<n;i++)
      {
        a+=i*i;
        System.out.print(a+" ");
      }
	}
}