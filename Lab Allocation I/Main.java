import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
      if(x<y && x<z)
        System.out.println("L1");
      else if(y<z && y<x)
        System.out.println("L2");
      else
        System.out.println("L3");
    }
}