import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    	int p=sc.nextInt();
    	int t=sc.nextInt();
        float r=sc.nextFloat();
      System.out.printf("%.2f",((p*t*r)/100));
    }
}