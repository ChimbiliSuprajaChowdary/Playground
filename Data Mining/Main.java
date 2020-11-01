import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=0,osum=0,esum=0;
      while(n!=0)
      {
        r=n%10;
        osum+=r;
        n=n/10;
        r=n%10;
        esum+=r;
        n=n/10;
      }
      if(osum==esum)
          System.out.println("yes");
        else
          System.out.println("No");
    }
}