package CoreJavaProgram;

public class Interface5 implements Interface3,Interface4 {

	public static void main(String[] args) {
		Interface5 i5=new Interface5();
		i5.d();
		i5.b();
	}

	public void d() {
		System.out.println("D method");
	}

	public void b() {
		System.out.println("b method");
	}
	

}
