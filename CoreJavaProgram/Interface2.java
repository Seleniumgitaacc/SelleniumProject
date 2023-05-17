package CoreJavaProgram;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
	     	Interface1 in=new Interface2();
		in.a();
	}

	public void a() {

		System.out.println("Interface a method");
	}

}
