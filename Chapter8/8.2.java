package Q2;

import java.util.Arrays;

public class findPath
{
	public static boolean findPath(int[][] map, int r, int c, int[][] path)
	{
		if(r<0||c<0||map[r][c]==0)
		{
			return false;
		}
		
		if(findPath(map, r-1, c, path)||findPath(map, r, c-1, path)||(r==0&&c==0))
		{
			path[r][c]=1;
			return true;
		}
		
		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
            int row=4, column=4;
			int[][] map= new int[row][column];
			int[][] path= new int[row][column];
			for(int i=0;i<map[0].length;i++)
			{
				for(int j=0;j<map[1].length;j++)
				{
					map[i][j]=1;
				}
			}
			for(int i=0;i<path[0].length;i++)
			{
				for(int j=0;j<path[1].length;j++)
				{
					path[i][j]=0;
				}
			}
			map[0][1]=0;
			map[1][1]=0;
			map[2][2]=0;
			
			findPath(map,3,3,path);

			for(int i=0;i<path[0].length;i++)
			{
				for(int j=0;j<path[1].length;j++)
				{
					System.out.print(" "+path[i][j]);
				}
				System.out.println();
			}
	}

}
