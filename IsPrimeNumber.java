package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		//intial a value upto which we want to calculate the prime number
		int n = 15;
		//two for loops needed
		//first for loop to iterate the numbers from 2 to 15(n)
		//i can be considered as numerator		
		for (int i = 2; i <=n; i++) {
			boolean isPrime=true;
			//second for loop iterates through possible divisors up to one less than the numerator
			//j can be considered as denominator
			for (int j = 2; j<i; j++) {
				if (i%j==0) {
					isPrime=false;
					break;
				}
				
			}
		if(isPrime) {
			System.out.println(i+ " is a prime number");}
		else {
			System.out.println(i+ " is not a prime number");
			}
		}			
		}
	}


