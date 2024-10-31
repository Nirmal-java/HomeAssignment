package week3.homeAssignment;

// Week3 Day 1 Home Assignment 2 - Polymorphism

public class APIClient {

		public void sendRequest(String endpoint)
		{
			System.out.println("Endpoint " + endpoint);
			System.out.println("sendRequest completed\n");
		    			
		}
		public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
		{
			
			System.out.println("Endpoint        " + endpoint);
			System.out.println("RequestBody     " + requestBody);
			System.out.println("requestStatus   " + requestStatus);
			System.out.println("sendRequest completed\n");

		}

		public static void main(String[] args) {
			
			APIClient request = new  APIClient();
			request.sendRequest("One argument");   // calls sendRequest(String endpoint)
			request.sendRequest("Two argument", "Payload", true); // calls sendRequest(String endpoint, String requestBody, boolean requestStatus)
		
	}

}
