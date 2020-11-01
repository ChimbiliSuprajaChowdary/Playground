import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
      int ct=4,a=0,b=0,c=1,sum=0;
      System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        
      while(ct<=n)
      {
         
        sum=a+b+c;
                System.out.print(sum+" ");
        ct++;
        a=b;
        b=c;
        c=sum;
      }
		
      
    }
}