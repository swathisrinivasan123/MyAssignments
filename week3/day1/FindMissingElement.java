package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] a={1, 4,3,2,8, 6, 7};
//in the given numbers we have to find the missing number
//first sort the numbers using Arrays.sort
//FOR loop will iterate through the number from 1st number to last number
//index will start from 0
//second number must be first number +1
//if second number is equal to first number + 1 , then ignore
//if second number is not equal to first number , then print the number 
//this can be done using break
//sorted order = 1,2,3,4,6,7,8
	Arrays.sort(a);	
	for (int i = 0; i < a.length-1; i++) {
				if (a[i+1]!=a[i]+1)
		{
			System.out.println("Missing number is "+ (a[i] +1));
			break;
		
	}
		}
		
						
				
			}

	

	}


