import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    	 char a=sc.next().charAt(0);
      	if(a==65 || a==69 || a==73 || a==79 || a==85 || a==97 || a==101 || a==105 || a==111 || a==117)
         System.out.println("Vowel");
      
          else   if((a>=65 && a<=90) || (a>=97 && a<=122))
            
     	   System.out.println("Consonant");
         
      else
        System.out.println("Not an alphabet");
    }
}