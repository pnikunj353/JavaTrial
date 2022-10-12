package newtest;

public class functionWithReturn {

	public static void main(String[] args) {

		int d=add(10,5);
		System.out.println(d);
		
	}
	
	public static int add(int a, int b) {
		
		int c=a+b;
		return c;
	}

}
