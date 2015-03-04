import java.util.Scanner;


public class LoginLoop2 {
	public static void main(String[] args){
		String username = "Kowar", password = "Annandale", a, b;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner (System.in);
	
	    
	    
		for (int i=0; i<3; i++) {
			System.out.println("Hello, enter the correct username and password.");
			a = keyboard.nextLine();
		    b = keyboard.nextLine();
		    
		    if (username.equalsIgnoreCase(a)&&password.equals(b))
		    {
		    	System.out.println("Welcome " + username + "!");
		    	return;//when the condition is reached it returns the final value
		    }
	    }

		System.out.println("Please contact your adminstrator to unlock your account!");
		
	}
		
}