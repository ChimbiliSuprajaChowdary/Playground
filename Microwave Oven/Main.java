import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int items=sc.nextInt();
      float time=sc.nextFloat();
      if(items==1)
        System.out.printf("%.2f",time);
      else if(items==2)
        System.out.printf("%.2f",1.5*time);
      else if(items==3)
        System.out.printf("%.2f",2*time);
      else
        System.out.printf("Number of items is more");
	}
}