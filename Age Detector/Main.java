import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int byear=sc.nextInt();
      int year=sc.nextInt();
      if(byear>year)
        System.out.println(100-(byear-year));
      else if(year>byear)
        System.out.println(year-byear);
	  else
        System.out.println(100-byear);
    }
}