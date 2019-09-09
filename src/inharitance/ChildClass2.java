package inharitance;

public class ChildClass2 extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseClass ob = new ChildClass2();
		
		/*ChildClass2 ob = new BaseClass();*/
		
		ob.add();
		ob.sub();
	}
	
	public void mul(){
		
		System.out.println("This class is for multiplication");
	}
	
	public void div() {

		System.out.println("This class is for divition");
	}

}
