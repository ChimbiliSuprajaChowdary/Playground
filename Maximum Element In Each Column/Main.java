import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
     int m=sc.nextInt();
    int arr[][]=new int[n][m];
    for(int i=0;i<n;i++)
      for(int j=0;j<n;j++)
      arr[i][j]=sc.nextInt();
      
    for(int i=0;i<n;i++){
      int max=arr[0][i];
      for(int j=0;j<n;j++){
      if(arr[j][i]>max)
        max=arr[j][i];
     }
      System.out.println(max);
      }
    }
}