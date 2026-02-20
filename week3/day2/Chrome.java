package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("openIncognito-Chrome class");
		
	}
	public void clearCache()
	{
		System.out.println("clearCache=Chrome class");
	}

	public static void main(String[] args) {
		
		Chrome chrome = new Chrome();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.openIncognito();
		chrome.clearCache();
		
		
	}
}
