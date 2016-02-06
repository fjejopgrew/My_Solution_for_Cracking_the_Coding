
public class isPermutationofpalindrome {
		public static boolean isPermutationofpalindrome(String phrase)
		{
			int[] table=buildCharFrequencyTable(phrase);
			return checkMaxodd(table);
		}
	
		public static int getCharnumber(Character c)
		{
			int a=Character.getNumericValue('a');
			int z=Character.getNumericValue('z');
			int A=Character.getNumericValue('A');
			int Z=Character.getNumericValue('Z');
			
			int val=Character.getNumericValue(c);
			if(a<val&&val<z)
			{
				return val-a;
			}
			else if(A<val&&val<Z)
			{
				return val-Z;
			}
			return -1;
		}
		
		public static boolean checkMaxodd(int[] table)
		{
			boolean foundOdd=false;
			for(int count:table)
			{
				if(count%2==1)
				{ 
					if(foundOdd)
						return false;
					foundOdd=true;
				}
			}
			return true;
		}
		
		//count how many times each character appears 
		public static int[] buildCharFrequencyTable(String phrase)
		{
			int[] table=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
			for(char c:phrase.toCharArray())
			{
				int x=getCharnumber(c);
				if(x!=-1)
					table[x]++;
			}
			return table;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbccddefg";
		System.out.println(isPermutationofpalindrome(str));
	}

}
