import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
      int c=0,temp;
      if(n>=100 && n<=999)
      {
          n=n/10;
          temp=n%10;
           if(temp%3==0)
          System.out.println("Trendy Number");
          }
    //    System.out.println("Not a Trendy Number");
      else
      System.out.println("Not a Trendy Number");
    }
}