package compliePolyMorphism;

public class CompileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileDemo ob1 = new CompileDemo();
		ob1.add(10 , 10);
		ob1.add(20, 30 , 20);
		ob1.add(12.10, 16.33);
		ob1.add(121.21, 20);
		ob1.add(10, 1444);

	}
	
	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Added value is: " + c);
	}

	public void add(int a, int b, int d) {

		int c = a + b + d;
		System.out.println("Added value is: " + c);
	}

	public void add(double a, double b) {

		double c = a + b;
		System.out.println("Added value is: " + c);
	}
	
	public void add(double a, int b) {

		double sum = a + b;
		System.out.println("Added value is: " + sum);
	}
	
	public void add(int a, double b) {

		double sum = a + b;
		System.out.println("Added value is: " + sum);
	}


}
