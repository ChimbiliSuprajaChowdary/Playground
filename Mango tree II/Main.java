import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int n=sc.nextInt();
      
      if(n%r==1 || n<=c || (n<=(r*c) && n>(r*(c-1))))
        System.out.println("yes");
      else
        System.out.println("No");
	}
}