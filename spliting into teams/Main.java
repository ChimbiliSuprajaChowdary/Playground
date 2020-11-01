import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
  System.out.println("The number of students in each team is "+l/b+" and left out is "+l%b);
}
}