import java.util.*;
class Main
{
  public static int power(int n,int m)
  {
    int pro=1;
    for(int i=1;i<=m;i++)
    {
      pro*=n;
    }
    return pro;
  }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println(power(n,m));
  }
}