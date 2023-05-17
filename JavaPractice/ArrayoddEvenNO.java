package JavaPractice;

public class ArrayoddEvenNO {

	public static void main(String[] args) {
       int a[]= {5,55,2,56,8};
       System.out.println("odd number");
       for(int i=0;i<a.length;i++) {
    	   if(a[i]%2!=0) {
    		   System.out.println(a[i]);
    	   }
       }
       System.out.println("even numbers");
       for(int i=0;i<a.length;i++) {
    	   if(a[i]%2==0)
    	   {
    		   System.out.println(a[i]);
    	   }
       }
	}

}
