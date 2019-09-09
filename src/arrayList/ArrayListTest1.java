package arrayList;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		
		ArrayList<String> ob = new ArrayList<String>();
		
		ob.add("saurav");
		ob.add("TestUser");
		ob.add("User1");
		ob.add("User2");
		
		for(String j:ob){
			System.out.println("ArrayList Values are: "+j);
		}
		

	}

}
