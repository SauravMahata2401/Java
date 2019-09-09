package pkgArray;

public class OneDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student_id[] = new int[5];
		
		student_id[0]=(int) 89.5;
		student_id[1]=58;
		student_id[2]=44;
		student_id[3]=91;
		student_id[4]=42;
		
		int sizeofArray = student_id.length;
		
		System.out.println("Length of the Array"+sizeofArray);
		
		for(int i=0; i<sizeofArray; i++){
			System.out.println("Values of "+i+"th element is: "+student_id[i]);
		}
	}

}
