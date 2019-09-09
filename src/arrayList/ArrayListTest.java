package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList ob = new ArrayList();
		
		ob.add('s');
		ob.add(2323);
		ob.add("saurav");
		ob.add("saurav");
		ob.add(23.11);
		
		System.out.println(ob);
		System.out.println(ob.get(3));
		
		for(int i=0;i<ob.size();i++){
			System.out.println("ArrayList values are: "+ob.get(i));
		}
		
		for(Object j:ob){
			System.out.println("ArrayList Values are: "+j);
		}
		
		Iterator itr = ob.iterator();
		
		while(itr.hasNext()){
			Object value = itr.next();
			System.out.println("Values are: "+value);
		}
		

	}

}
