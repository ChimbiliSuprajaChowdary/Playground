import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int temp;
      for(int i=1;i<=n;i++){
         temp=1;
        for(int j=1;j<=i;j++)
        {
         if(temp==1){
            System.out.print(temp+" ");
           temp=0;
         }
          else {
        System.out.print(temp+" ");
          temp=1;
          }
        }
    
        System.out.print("\n");
        
      }
	}
}