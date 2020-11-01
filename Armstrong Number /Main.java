import java.util.Scanner;
import java.lang.*;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0,sum=0,r,pro=1;
      int temp=n;
      while(temp!=0)
      {
        temp=temp/10;
        c++;
      }
   temp=n;
      for(int i=0;i<c;i++)
      {
        r=temp%10;
      //  for(int j=0;j<c;j++)
        sum+=Math.pow(r,c);
        temp/=10;
      }
	if(sum==n)
      System.out.println("Armstrong Number");
      else 
     System.out.println("Not a Armstrong Number");
    }
   }