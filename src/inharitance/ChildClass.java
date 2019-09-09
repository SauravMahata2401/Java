package inharitance;

public class ChildClass extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass ob = new ChildClass();
		
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		

	}
	
	public void mul(){
		
		System.out.println("This class is for multiplication");
	}
	
	public void div() {

		System.out.println("This class is for divition");
	}

}
