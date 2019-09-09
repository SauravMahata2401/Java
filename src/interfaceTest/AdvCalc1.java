package interfaceTest;

public class AdvCalc1 implements Calc{

	public static void main(String[] args) {
		
		Calc ob = new AdvCalc1();
		ob.add();
		ob.sub();

	}
	
	public void CalculateSin(){
		
		System.out.println("I'm in Sin methode");
		
	}
	
	public void CalculateCos() {
		
		System.out.println("I'm in Cos methode");

	}

	
	public void add() {
		
		System.out.println("I'm in adition methode");
		
	}

	public void sub() {
		
		System.out.println("I'm in substraction methode");
	}

}
