import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=6;
      for(int i=0;i<n ;i++)
      {
        c=c+(5*i);
        System.out.print(c+" ");
      }
	}
}