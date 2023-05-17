package CoreJavaProgram;

public class ConstructorOverloaded {

	ConstructorOverloaded(){
		System.out.println("Print defaltcostructor");
	}
	ConstructorOverloaded(int a){
		System.out.println(a);
	}
	ConstructorOverloaded(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		ConstructorOverloaded con=new ConstructorOverloaded();
		ConstructorOverloaded con1=new ConstructorOverloaded(11);
		ConstructorOverloaded con2=new ConstructorOverloaded("Sam");
		
	}
}
