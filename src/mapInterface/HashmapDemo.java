package mapInterface;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> ob = new  HashMap<String, String>();
		
		ob.put("91", "Saurav");
		ob.put("10", "Tosca");
		ob.put("11", "UFT");
		ob.put("12", "Appium");
		ob.put("13", "Selenium");
		
		System.out.println(ob);
		
		String value = ob.get("10");
		System.out.println("value is "+value);
		
		String value1 = ob.get("103");
		System.out.println("value is "+value1);

	}

}
