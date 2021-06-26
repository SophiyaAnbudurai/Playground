import java.util.*;
public class Main
{
	public static void main(String[] args)
		{
			int n, flag = 0;
			Scanner sc = new Scanner(System.in);
			//System.out.print("\nEnter the order of the matrix : ");
			n = sc.nextInt();
			int[][] mat1 = new int[n][n];
     // mat1=sc.nextInt();
			//System.out.print("\nInput the matrix elements : \n");
			int i, j;
			for(i = 0; i < n; i++)
				{
					for(j = 0; j < n; j++)
						mat1[i][j] = sc.nextInt();
				}
			for (i = 1; i < n; i++)
				for (j = 0; j < i; j++)
					if (mat1[i][j] != 0)
						flag = 0;
					else		
						flag = 1;
	
			if (flag == 1)
				System.out.println("yes");
			else
				System.out.println("no");
	
			}
}