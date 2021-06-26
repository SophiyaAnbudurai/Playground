import java.util.*;
public class Main
{
/*{
	static int N = 3;
	public static int check_lower_triangular(int mat[][])
		{
			int i, j;
			for (i = 0; i < N; i++)
				for (j = i + 1; j < N; j++)
					if (mat[i][j] != 0)
						return 0;
			return 1;
		}*/
	public static void main(String[] args)
		{
			int n, flag = 0;
			Scanner sc = new Scanner(System.in);
			//System.out.print("\nEnter the order of the matrix : ");
			n = sc.nextInt();
			int[][] mat1 = new int[n][n];
			//System.out.print("\nInput the matrix elements : \n");
			int i, j;
			for(i = 0; i < n; i++)
				{
					for(j = 0;j < n; j++)
						mat1[i][j] = sc.nextInt();
				}
     //  int N = 3;
      int mat[][];
      for (i = 0; i < n; i++)
				for (j = i + 1; j < n; j++)
					if (mat1[i][j] != 0)
                      flag = 0;
					else		
						flag = 1;
					//	return 0;
      
			//int res = check_lower_triangular(mat1);
			if (flag == 1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
}