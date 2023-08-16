package cart;

import java.util.Scanner;

public class User {
		String user;
		String pswd;
		
		
		public int userchoices()
		{
			int a;
			
			do {
			System.out.println("Make a choice: 1. View Products 2. Exit");
			
			Scanner sc =new Scanner(System.in);
			a= sc.nextInt();
			if (a==1 )
				return a;
		
		
			else  if (a==2)
			{
			System.out.println("Making an exit...");
			
			System.exit(0);
			
					
			}
			
			else 
			{
				System.out.println("Invalid CHoice ");
				
			}
			}while(a>2);
		
		return 0;	
		}
		
		public  User(String user, String pswd) {
			
			Scanner sc =new Scanner(System.in);
			
			this.user = user;
			this.pswd = pswd;
			boolean check = true;
		do
			{System.out.println("Enter username: ");
			user=sc.next();
			
			System.out.println("Enter password: ");
			pswd=sc.next();
			
		
			if(this.user.equals(user) && this.pswd.equals(pswd))
			{
				
				System.out.println("Welcome!!");
				check =false;
			}
			else
			{
				System.out.println("Wrong Credentials");
				
			}
			} while(check);
			
		}
			
		

}
