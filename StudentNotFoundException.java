package customexpection;

import java.rmi.StubNotFoundException;

public class StudentNotFoundException extends RuntimeException{
	private String message;
	public StudentNotFoundException(String message)
	{
		this.message=message;
	}
	public String getMessege() {
		return message;
	}

}
