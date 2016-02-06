
public class rotate
{
	public static void rotate(int[][] matrix, int n)
	{
		for (int layer = 0; layer < n / 2; layer++)
		{
			int first = layer;
			int last = n - layer - 1;
			for (int i = first; i < last; i++)
			{
				int offset = i - first;

				// save
				int top = matrix[first][i];

				// left->top
				matrix[first][i] = matrix[last - offset][first];

				// bottom->left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right->bottom
				matrix[last][last - offset] = matrix[i][last];

				matrix[i][last] = top;
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
				{ 7, 8, 9 } };
		rotate(matrix, 3);
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
