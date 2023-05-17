package JavaPractice;

public class javaProgram {

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
			//break;
		}
		if(rev==a) {
			System.out.println(rev+"is reminder");
		
		}else
			System.out.println(rev+"is not reminder");
	}

}
