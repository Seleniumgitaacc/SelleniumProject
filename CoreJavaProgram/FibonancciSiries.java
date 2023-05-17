package CoreJavaProgram;

public class FibonancciSiries {

	public static void main(String[] args) {
       
		int n=10;
		int f=1;
		int s=1;
		int t;
		System.out.println(f);//1
		System.out.println(s);//1
		for(int i=2;i<=n;i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
			
		}
	}

}
