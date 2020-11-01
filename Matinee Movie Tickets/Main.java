import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();
      float time=sc.nextFloat();
      if(age>13)
      {
        if(time>=12.00)
          System.out.printf("$5.00");
        else
          System.out.printf("$8.00");

      }
      else
      {
         if(time>=12.00)
          System.out.printf("$2.00");
        else
          System.out.printf("$4.00");
      }
	}
}