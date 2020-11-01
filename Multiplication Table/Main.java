import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      int a=1;
      while(a<=n)
      {
        System.out.println(a+"*"+m+"="+a*m);
        a++;
      }
    }
}