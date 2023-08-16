package cart;

import java.util.Scanner;

public class firstPage{

	int a;
	
	public void start()
	{
		System.out.println("Make a choice: 1. Login 2. Exit");
		
		Scanner sc =new Scanner(System.in);
		a= sc.nextInt();
		if (a==1)
				
		
		return ;	
	
			
		else  if (a==2)
		{
		System.out.println("Making an exit...");
		
		System.exit(0);
		
				
		}
		
		else 
		{
			System.out.println("Invalid CHoice ");
			start();
		}
		
	}
	
}
