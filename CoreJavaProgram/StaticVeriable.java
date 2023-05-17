package CoreJavaProgram;

public class StaticVeriable {
	
	int a=5; //Global method
	 static int b=34;//Static method

	public static void main(String[] args) {
		StaticVeriable st= new StaticVeriable();
		method1();
		
		System.out.println(st.a);
	}

	//static method
	public static void method1() {
		
		String h="Vrushali";
		System.out.println(b);
		System.out.println("h");
	}
}
