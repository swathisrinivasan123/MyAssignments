package week3.day2;

public class Safari extends Browser {
	
	public void readerMode()
	{
		System.out.println("readerMode - Safariclass");
	}
	
	public void fullScreenMode()
	{
		System.out.println("fullScreenMode - Safari class");
	}
	public static void main(String[] args) {
		Safari safari = new Safari();
		safari.openURL();
		safari.closeBrowser();
		safari.navigateBack();
		safari.readerMode();
		safari.fullScreenMode();
	}

}
