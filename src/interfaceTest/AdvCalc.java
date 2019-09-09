package interfaceTest;

public class AdvCalc implements Calc{

	public static void main(String[] args) {
		
		AdvCalc ob = new AdvCalc();
		ob.add();
		ob.sub();
		ob.CalculateSin();
		ob.CalculateCos();

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
