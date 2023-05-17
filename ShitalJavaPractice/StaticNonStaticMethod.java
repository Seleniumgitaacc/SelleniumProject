package ShitalJavaPractice;

public class StaticNonStaticMethod {
   static String  s1="Shital";
   int a=10;//non static veriable
	public static void method() {
		//Static method
		
		System.out.println("Print static method");
	}
	 void method2() {
		//Non static method
		System.out.println("Print non static methods");
				
	}
	
	
	public static void main(String[] args) {
		StaticNonStaticMethod s= new StaticNonStaticMethod();
		s.method2();
			System.out.println(s.a);
		StaticNonStaticMethod.method();
		System.out.println(StaticNonStaticMethod.s1);
		s.method3();
		method4();
	}
	private static void method4() {
		// TODO Auto-generated method stub
		System.out.println("Method4");
		
	}
	public  void method3() {
		// TODO Auto-generated method stub
		System.out.println("Print method 3");
		
	}

}//class
class shital{
	public static void main(String[] args) {
		StaticNonStaticMethod obj=new StaticNonStaticMethod();
		obj.method2();
		StaticNonStaticMethod.method();
		System.out.println(StaticNonStaticMethod.s1);
		System.out.println(obj.a);
		obj.method3();
				
	}
}