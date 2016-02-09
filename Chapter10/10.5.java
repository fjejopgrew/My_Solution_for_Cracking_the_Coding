package Q5;

public class sparseSearch
{
	public static int search(String[] str, String s, int first, int last)
	{
		if (first > last)
			return -1;
		// find mid
		int mid = (first + last) / 2;

		// if mid is empty, find closest non-empty string
		if (str[mid].isEmpty())
		{
			int left = mid - 1;
			int right = mid + 1;
			while (true)
			{
				if (left < first && right > last)
				{
					return -1;
				}
				else if(right<=last&&!str[right].isEmpty())
				{
					mid=right;
					break;
				}
				else if(left>=first&&!str[left].isEmpty())
				{
					mid=left;
					break;
				}
				left--;
				right++;
			}
		}
		
		//comepare tow strings
		if(str[mid].equals(s))
		{
			return mid;
		}
		else if(str[mid].compareTo(s)<0)
		{
			return search(str, s, mid+1, last);
		}
		else 
		{
			return search(str, s, first, mid-1);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] str={"at","","","","ball","","","car","","","dad","","",};
		String s="ball";
		System.out.println(search(str, s,0,str.length));
	}

}
