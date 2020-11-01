import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
      System.out.println("Alice must go in path-"+((l/10)+(l%10)));
	}
}