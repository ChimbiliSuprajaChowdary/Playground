import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      float a=sc.nextInt();
      float b=sc.nextInt();
      float c=sc.nextInt();
      float d=sc.nextInt();
      float e=sc.nextInt();
      float avg=(a+b+c+d+e)/5;
      System.out.println(Math.round(avg * 100.0) /( 100.0));
    }
}