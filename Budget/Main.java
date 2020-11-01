import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int br=sc.nextInt();
      int vs=sc.nextInt();
      int as=sc.nextInt();
      int a=sc.nextInt();
      int l=sc.nextInt();
      float c=(float)((br*350.34)+(vs*230.90)+(190.55*as)+(a*125.30)+(180.90*l));
      if(c<=15000.00)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}