import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    	int time=sc.nextInt();
      int count=1,a=0,b=1,sum=0;
      while(count<=time)
      {
        sum=a+b;
        a=b;
        b=sum;
        sum=a;
        count++;
        if(time==count)
          System.out.println(sum);
      }
    }
}