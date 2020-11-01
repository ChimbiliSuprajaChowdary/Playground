import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=1,a=1;
      while(a<=n)
      {
        p=p*a;
        a++;
        if(p==n)
          break;
      }
       if(p==n)
         System.out.println("Yes");
      else
         System.out.println("No");

    }
}