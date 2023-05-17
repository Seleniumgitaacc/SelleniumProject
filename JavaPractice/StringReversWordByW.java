package JavaPractice;

public class StringReversWordByW {
	String OutputString;
	String inputstring;
	
	public static void main(String[] args) {
		StringReversWordByW s= new StringReversWordByW();
		s.inputstring="vrushali More";
		String word[] =s.inputstring.split("\\s");
		
		s.OutputString="";
		
		for(int i=word.length-1;i>=0;i--) {
			
			s.OutputString=s.OutputString + word[i]+"";
		
	}
		System.out.println("Input String"+": " +s.inputstring);
		System.out.println("OutputString"+": "+s.OutputString);
		
}
}
