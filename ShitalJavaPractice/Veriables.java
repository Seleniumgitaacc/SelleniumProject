package ShitalJavaPractice;

public class Veriables {
	//Global veribles // Instance veriable//Non static veribles//class level veribles
	int Accountno=10;
	long l=20;
	char c='r';
	float f=(float) 5.4;
	long sum;
	//Static veribles
	 static byte bt=45;
	static double d=345.0d;
	static boolean b=true;
	static short s=3456;
	static String st="vrushali and shital";

	
	 static int method1(){
		//method
		//local vriables 
		int a=10;
		long l=20;
		char c='r';
		float f=(float) 6.4;
		byte bt=45;
		return bt;
	}

	public static void main(String[] args) {
		//local veriable
		int al=10;
		long ll=20;
		char cl='r';
		float fl=(float) 6.4;
		byte btl=45;
		double dl=345.0d;
		boolean bl=true;
		short sl=3456;
	//	String st="Stital and shital";
		int sum;
		sum=al+btl;
		double ft=fl+dl;
		System.out.println(sum);//local
		System.out.println(cl);
		System.out.println(ft);//local
		//Global veribles
		Veriables v=new Veriables();//Object create
		v.Accountno=500;
		v.sum=v.Accountno+v.l;
		System.out.println(v.sum);
		
		//Static veriobles
		final String sss="ghhj";
		st="gfhgghjg";
		System.out.println(st);
	}
}
class shtal extends Veriables{
	public static void main(String[] args) {
		Veriables.st="Thombare shital";
		System.out.println(Veriables.st);
		Veriables v=new Veriables();
		v.Accountno=100;
		v.sum=v.Accountno+v.l;
		
		System.out.println(v.sum);
		
		
		
	}
}
