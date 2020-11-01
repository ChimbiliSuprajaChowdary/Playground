import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
      int ksq,n=0,one,two,temp=k,c=1;
      while(temp!=0)
      {
        temp=temp/10;
        n++;
      }
      ksq=k*k;
      while(n!=0)
      {
        c=c*10;
        n--;
      }
      one=ksq/c;
      two=ksq%c;
      if((one+two)==k)
        System.out.println("Kaprekar Number");
      else
        System.out.println("Not a Kaprekar Number");

    }
}