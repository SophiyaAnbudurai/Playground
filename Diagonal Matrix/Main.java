import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,i,j,flag=1;
        Scanner in=new Scanner(System.in);
      	n=in.nextInt();
        int mat[][]=new int[10][10];
        for(i=0;i<n;i++)
          for(j=0;j<n;j++)
            mat[i][j]=in.nextInt();
        for(i=0;i<n;i++)
          for(j=0;j<n;j++)
            if(i!=j)
            {
              if(mat[i][j]==0)
                flag=0;
              else
                flag=1;
            }
        if(flag==1)
          System.out.println("no");
        else
          System.out.println("yes");
	}
}