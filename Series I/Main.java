import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1,c=1;
     System.out.print(a+" ");
      for(int i=3;i<=(n*n);i++)
      {
        if(i%2==1 && c<n){
          a+=i;
          System.out.print(a+" ");
          c++;
        }
      }
	}
}