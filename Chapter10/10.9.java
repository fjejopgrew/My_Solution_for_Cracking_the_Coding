package Q9;


public class findElementInsortedMatrix
{
	public static int[] findElementInsortedMatrix(int[][] matrix, int elem)
	{
		int[] res= new int[2];
		int r=0,c=matrix.length-1;
		while(r<matrix.length&&c>=0)
		{
			if(matrix[r][c]==elem)
			{
				res[0]=r;
				res[1]=c;
				break;
			}
			else if(matrix[r][c]>elem)
			{
				c--;
			}
			else
			{
				r++;
			}
		}
		return res;
	}

	public static void main(String[] args)
	{
		int[][] Matrix = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}};
		System.out.println(findElementInsortedMatrix(Matrix, 18)[0]+" "+findElementInsortedMatrix(Matrix, 18)[1]);
		// TODO Auto-generated method stub
		
	}

}
