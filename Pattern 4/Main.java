import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int temp=n;
      for(int i=1;i<=n;i++){
         temp=n-i;
        for(int j=1;j<=n;j++)
        {
         
          if(j>=i)
            System.out.print(n);
          else {
        
            System.out.print(temp+1);
          temp++;
          }
        }
    
        System.out.print("\n");
        
      }
	}
}