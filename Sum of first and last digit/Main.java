import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     
      int l=n%10;
      while(n>9)
      {
        n=n/10;
      
      }
      System.out.println(n+l);
	}
}