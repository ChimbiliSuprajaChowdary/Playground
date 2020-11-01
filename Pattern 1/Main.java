import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      for(int i=1;i<=n;i++){
        
        for(int j=1;j<=2*n-i-a;j++)
        {
          System.out.print(j+" ");
          
        }
        a++;
        System.out.print("\n");
      }
        
	}
}