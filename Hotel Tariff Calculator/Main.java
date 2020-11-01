import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      float r=sc.nextFloat();
      int d=sc.nextInt();
      switch(m)
      {
        case 1:
        case 2:
        case 3:
        case 7:
        case 8:
        case 9:
        case 10:
          System.out.printf("%.2f",(d*r));
          break;
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:
          System.out.printf("%.2f",(1.2*d*r));
          break;
        default:
          System.out.println("Invalid Input");
          break;
      }
	}
}