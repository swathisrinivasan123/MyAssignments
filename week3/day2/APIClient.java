package week3.day2;

public class APIClient {

 public void sendRequest(String endpoint)
 {
	 System.out.println(endpoint);
 }
 public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
 {
	 	 System.out.println(endpoint +" "+ requestBody +" " +requestStatus);
 }
 public static void main(String[] args) {
	 
	 APIClient api = new APIClient();
	 api.sendRequest("https://leaftaps.com");
	 api.sendRequest("https://leaftaps.com", "Body", false);
	
}
}
