import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      for(int i=1;i<=n;i++)
      {
        for(int sp=n-i;sp>0;sp--)
          System.out.print(" ");
        for(int j=1;j<=i;j++)
          System.out.print(++a+" ");
        System.out.print("\n");
      }
    }    
}