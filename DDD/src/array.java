
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3중 for문 만들기 
		int[] studentnum = {10, 20, 5, 8};
		for ( int i = 0; i < studentnum.length; i++) {
			for (int j = 0; j < studentnum[i]; j++) {
				for (int k = 0; k < j; k++) {
			System.out.print("*");
			}
			System.out.println();
			}
			System.out.println(studentnum[i]);
		}
		
		
		
		
		int sum = 0;
		for ( int i = 0; i < studentnum.length; i++) {
			sum += studentnum[i];
		}
		System.out.println((float)sum/studentnum.length);
		
		
		
	}

}
