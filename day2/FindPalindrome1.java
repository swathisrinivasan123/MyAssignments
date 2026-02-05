package week1.day2;

public class FindPalindrome1 {

	public static void main(String[] args) {
		int input = 1456;
		int output = 0;
		for (int i=input; i >0; i=i/10) {
			int rem = i%10;
			output = output*10+rem;
		}
			System.out.println("Reversed number is " +output);
			if(output==input) {
				System.out.println(output + " is a palindrome"); }
				else {
					System.out.println(output + " is not a palindrome");}
			}
		}

