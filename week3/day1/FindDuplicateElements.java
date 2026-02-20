package week3.day1;



public class FindDuplicateElements {
	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] splittedWords=text.split(" ");
	for (int i = 0; i < splittedWords.length; i++) {
		for (int j = i+1; j < splittedWords.length; j++) {
			if (splittedWords[i].equalsIgnoreCase(splittedWords[j])) {
								splittedWords[j]=" ";
			
			}
			
					}
	
	}
	for (int j = 0; j < splittedWords.length; j++) {
		System.out.print(splittedWords[j]+ " ");
	}
			
		
	
	}

}
