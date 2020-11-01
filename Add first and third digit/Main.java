import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n/100;
      int b=n%10;
      System.out.println(a+b);
	}
}