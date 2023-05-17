package CoreJavaProgram;

public class Palindromno {

	public static void main(String[] args) {
		int num=3553;
		int a=num;
		int rev=0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			rev=rev*10+reminder;
			num=num/10;
			
		}
		if(rev==a)
		{
			System.out.println(a+"is reminder");
		}
		else
			System.out.println(a+"is not reminder");
	}
}
