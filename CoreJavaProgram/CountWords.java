package CoreJavaProgram;

public class CountWords {

	public static void main(String[] args) {

		String s="My name is vrushali more";
		
		int len=s.length();
		int count=1;
		for(int i=0;i<len-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count ++;
			}
		}
		System.out.println("Count number for words in string:" + " "  +count);
	}

}
