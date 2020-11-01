import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n,a,c=0,neg=0,pos=0;
      n=sc.nextInt();
      while(n!=0)
      {
        a=sc.nextInt();
        n--;
        if(a<0)
          neg++;
        else
          pos++;
       }
      System.out.println("Number of positive numbers is "+pos+" and the number of negative numbers is "+neg);
    }
}