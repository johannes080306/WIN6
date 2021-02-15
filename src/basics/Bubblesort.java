package basics;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlen = {3, 2, 6, 9, 1, 2, 8, 5, 3, 1};
		for (int a  = 1; a <= zahlen.length; a++) {
		int left = zahlen[a];
		int right= zahlen[a+1];
		if(left > right) {
		zahlen[a] = right;
		zahlen[a + 1] = left;
	
		
		
		
		
		}
		}		
		
	}

}
