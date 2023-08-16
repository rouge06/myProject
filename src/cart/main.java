package cart;
import java.util.Scanner;

public class main {

	public static void main (String[] args) {
		
		
		String username="user";
		String pswd="1234";
		
		int choice;
		firstPage f= new firstPage();
		f.start();
		
		User u=new User(username,pswd);
		choice=u.userchoices();
		
		
		switch(choice)
			
		{case 1: 
			Shop s=new Shop();
			s.display();
				break;
		
		case 2: System.exit(0);		
		
			break;
		}	
	}

}
