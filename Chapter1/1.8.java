
public class setZeros
{
	public static void nullfyColumn(int[][] matrix, int col)
	{
		for (int i = 0; i < matrix[1].length; i++)
		{
			matrix[i][col] = 0;
		}
	}

	public static void nullfyRows(int[][] matrix, int row)
	{
		for (int i = 0; i < matrix[0].length; i++)
		{
			matrix[row][i] = 0;
		}
	}

	public static void setZeros(int[][] matrix)
	{
		int row[] = new int[matrix[0].length];
		int column[] = new int[matrix[1].length];
		for (int i = 0; i < matrix[0].length; i++)
		{
			for (int j = 0; j < matrix[1].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = 1;
					column[j] = 1;
				}
			}
		}

		for (int i = 0; i < matrix[0].length; i++)
		{
			if (row[i] == 1)
			{
				nullfyRows(matrix, i);
			}
		}

		for (int i = 0; i < matrix[1].length; i++)
		{
			if (column[i] == 1)
			{
				nullfyColumn(matrix, i);
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] matrix =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 0 } };
		setZeros(matrix);
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
