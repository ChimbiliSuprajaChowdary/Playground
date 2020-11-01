import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a,c=0;
    	 float s=0;
      while(c!=3)
      {
        a=sc.nextInt();
        
        if(a%2==1)
        {
          s++;
          c++;
        }
       else if(a<0)
       {
          s-=1;
          c=3;
       }
         else 
        {
          s-=0.5;
        }
      }
      System.out.println(s);
      }
}