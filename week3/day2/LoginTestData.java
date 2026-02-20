package week3.day2;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Enter UserName - LoginTestData Sub class");
	}
	public void enterPassword() {
		System.out.println("Enter password - LoginTestData Sub class");
	}
	public static void main(String[] args) {
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
	}

}
