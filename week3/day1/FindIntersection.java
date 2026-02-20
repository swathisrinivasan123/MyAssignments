package week3.day1;

public class FindIntersection {
	
	
//Input : Two arrays Output expected = 2,4,7
//Each value of a[] must be compared with all values of b[]
//First for loop to iterate through all values of a[]
//second for loop to iterate through all values of b[]
//if loop to compare the one value of a[] with all values of b[]
//if the values matches , write in the output

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
				
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println("Common numbers between two arrays are " +a[i]);
					
				}
				
			}
			
		}
		
		
	}
}
