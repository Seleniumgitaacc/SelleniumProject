package CoreJavaProgram;

public class JavaFirstProgram {
	
	int a=9;//Global veriable/Instance veriable/class level verible
	
	//user defined methods
	public void method1() {
		a=2;
		int y = 56;//Local veriable
		System.out.println(y);
		y=60;
		System.out.println(a);
		System.out.println(y);
	}
	//User defined methods
	public void method2() {
		a=3;
		int y = 7;//local veriable
		System.out.println(a);
		System.out.println(y);
		y =67;
		System.out.println(y);
	}

	public static void main(String[] args) {
		JavaFirstProgram n=new JavaFirstProgram();//object create
		n.a=5;
         int y=5;//local
         System.out.println(n.a);
         System.out.println(y);
		n.method1();
		n.method2();
		
		
	}

}
