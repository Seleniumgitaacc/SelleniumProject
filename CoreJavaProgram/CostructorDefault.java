package CoreJavaProgram;

public class CostructorDefault {

	int id;
	String name;
	String address;
	CostructorDefault()	{
	System.out.println("Print default custructor");
	}
	public void CostructsorDefault() {
	System.out.println("Print non custructor");
	
	
	}
	
	CostructorDefault(int a,String s,String d){
		this.id=a;
		name= s;
		address=d;
	}
	public void display() {
		System.out.println("name");
		System.out.println(id);
		System.out.println("address");
	}
	
	public static void main(String[] args) {
		CostructorDefault con= new CostructorDefault();
		con.CostructsorDefault();
		CostructorDefault con1=new CostructorDefault(60,"name","Address");
		con1.display();
	}

}
