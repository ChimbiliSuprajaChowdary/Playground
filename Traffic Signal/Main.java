import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      float speed=sc.nextFloat();
      float dist=sc.nextFloat();
      float time=sc.nextFloat();
      float newtime=time/3600;
      float newspeed=(dist)/newtime;
      
      if(newspeed>speed)
        System.out.println("No");
      else
        System.out.println("Yes");

	}
}