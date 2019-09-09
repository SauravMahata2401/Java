package pkgArray;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int school[][] = new int[2][3];
		
		school[0][0]=26;
		school[0][1]=36;
		school[0][2]=87;
		school[1][0]=56;
		school[1][1]=76;
		school[1][2]=56;
				
		int length = school.length;
		
		System.out.println("Array length is: "+length);
		
		for(int i=0 ; i<2 ; i++){
			for(int j=0;j<=length;j++){
				System.out.println("Array is"+school[i][j]);
			}
	   }
	
	}

}
