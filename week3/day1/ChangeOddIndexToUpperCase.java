package week3.day1;


public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
				char[] charArray=test.toCharArray();
		 for (int i = 0; i < charArray.length; i++) {
			 if (i%2==1) {
				 charArray[i]=Character.toUpperCase(charArray[i]);
			}
			
		}
		 String result=new String(charArray);
			System.out.println(result);
	}

}
