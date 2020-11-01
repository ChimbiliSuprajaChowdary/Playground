import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int j,a=1;
      for(int i=1;i<=n;i++){
        
        for( j=a;j<=2*n-1;j++)
        {
          
          System.out.print(j+" ");
          j++;
          }
        a+=2;
        
        System.out.print("\n");
      }
	}
}