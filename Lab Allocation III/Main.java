import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
      int n=sc.nextInt();
      int count=0;
      if(x>=n)
        count++;
      if(y>=n)
		count++;
     if(z>=n)
        count++;
      System.out.println(count);
    }
}