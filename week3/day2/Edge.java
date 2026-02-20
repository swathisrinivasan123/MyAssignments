package week3.day2;

public class Edge extends Browser {
	public void takeSnap()
	{
		System.out.println("takeSnap-Edgeclass");
	}
	public void clearCookies()
	{
		System.out.println("clearCookies-Edgeclass");
	}
	public static void main(String[] args) {
		Edge edge=new Edge();
		edge.openURL();
		edge.closeBrowser();
		edge.navigateBack();
		edge.takeSnap();
		edge.clearCookies();
	}

}
