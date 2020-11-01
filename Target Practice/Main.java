import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        int s=0,c=0;
        
		while(s<tar)
        {
        	int a=sc.nextInt();
          c++;
          s=s+a;
          if(s>=tar)
            System.out.println("The number of turns is "+c);
        }
    }
}