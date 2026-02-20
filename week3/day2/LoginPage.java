package week3.day2;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("performCommonTasks method is overriden in LoginPage class");
	}
	
	
	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.performCommonTasks();
		
		
	}
	

}
