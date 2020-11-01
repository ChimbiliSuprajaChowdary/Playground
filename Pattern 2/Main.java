import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++)
        {
          if(a==1){
          System.out.print(a+" ");
            a=0;
          }
          else{
          System.out.print(a+" ");
            a=1;
          }
        }
       
        System.out.print("\n");
      }
        
	}
}