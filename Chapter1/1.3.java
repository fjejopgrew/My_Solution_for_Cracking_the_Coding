import CtCILibrary.AssortedMethods;

public class replaceSpaces {
	public static void replaceSpaces(char[] str, int length)
	{
		int spaceCount=0, newlength, i;
		for(i=0;i<length;i++)
		{
			if(str[i]==' ')
			{
				spaceCount++;
			}
		}
		newlength=length+spaceCount*2;
		str[newlength]='\0';
		for(i=length-1;i>=0;i--)
		{
			if(str[i]==' ')
			{
				str[newlength-1]='0';
				str[newlength-2]='2';
				str[newlength-3]='%';
				newlength=newlength-3;
			}
			else
			{
				str[newlength-1]=str[i];
				newlength=newlength-1;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc d e f";
		int spaces=3;
		char[] arr= new char[str.length()+2*spaces];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		for(int i=str.length();i<arr.length;i++)
		{
			arr[i]=' ';
		}
		System.out.println(AssortedMethods.charArrayToString(replaceSpaces(arr,str.length())));
	}

}
