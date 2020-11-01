import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=2;
      for(int i=0;i<n;i++)
      {
        a+=(13*i);
        System.out.print(a+" ");
      }
	}
}