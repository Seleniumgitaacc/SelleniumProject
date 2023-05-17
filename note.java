import java.util.*;
public class note {

	public static void main(String[] args) {
		
		note rs=new note();
		Scanner sc=new Scanner(System.in);
		System.out.println("String value enter");
		String name=sc.nextLine();
		
		
		System.out.println("reverse of a string is:"+rs.reversestr(name));
	
	}
	static String reversestr(String s) {
		String r = "";
		for(int i=s.length();i>0;--i) {
			r=r+(s.charAt(i-1));
			
		
		
		r=r+(s.charAt(i-1));
	}
return r;
}
}
