package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo2 {

	public static void main(String[] args) {
		
		HashMap<String, String> ob = new  HashMap<String, String>();
		
		ob.put("91", "Saurav");
		ob.put("10", "Tosca");
		ob.put("11", "UFT");
		ob.put("12", "Appium");
		ob.put("13", "Selenium");
		
		for(Map.Entry<String, String> data : ob.entrySet()){
			
			System.out.println("Key is "+data.getKey()+" and value is "+data.getValue());			
		}
		
		

	}

}
