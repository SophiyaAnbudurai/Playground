import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,i,j,Dia1=0,Dia2=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int mat[][]=new int[10][10];
        for(i=0;i<n;i++)
          for(j=0;j<n;j++)
            mat[i][j]=in.nextInt();
        for(i=0;i<n;i++)
          for(j=i;j==i;j++)
            Dia1+=mat[i][j];
        for(i=0;i<n;i++)
          for(j=n-1-i;j==(n-1)-i;j++)
            Dia2+=mat[i][j];
        if(Dia1==Dia2)
        {
          System.out.println("yes");
        }
        else
          System.out.println("no");
          }
}