package assign.queue;

public class MyQueueExp extends Exception{
  
	// instance member
	String message;
	
	// parameter constructor
	public MyQueueExp(String message) {
		this.message = message;
		
	}
	// get message 
	public String getMessage() {
		return message;
	}
}
