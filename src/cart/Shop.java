package cart;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Shop {
	

	List  <Items> itemList = new ArrayList<Items>();
	List  <Items> cart = new ArrayList<Items>();
	int sum;
	
	
	public Shop ()
	{
		itemList.add(new Items("Whirlpool Fridge", 10000));
		itemList.add(new Items("Samsung Z fold", 140000));
		itemList.add(new Items("Iphone 14", 70000));
		itemList.add(new Items("Redmi 3s Prime", 9000));
		itemList.add(new Items("Samsung Washing Machine", 8000));
		itemList.add(new Items("Micromax in 1", 10000));
		itemList.add(new Items("Lg Smart Tv ", 30000));
		itemList.add(new Items("Lenovo Thinkpad", 50000));
		
	}
	
	
	
	
	public void display()
	{	int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Make a choice: \n");
        int i = 1;
        for (Items item : itemList) {
            System.out.println(i + " Product: " + item.getName() + " Price: " + item.getPrice());
            i++;
        }

        choice = sc.nextInt();
        addToCart(choice);
		
	}
	
	
	
	public void addToCart(int choice)
	
	{	Scanner sc=new Scanner(System.in);	
	int a;
		if (choice >= 1 && choice <= 8) {
					Items i = itemList.get(choice - 1);
			        cart.add(i);
			        sum+=(Integer)cart.get(choice-1).getPrice();
			        System.out.println("Product added to cart");
					} 

			else {
			System.out.println("Invalid choice");
			display();
			}
			
	do {		System.out.println("Make a choice: 1. Continue Shopping 2. View cart 3. Exit");
			 a = sc.nextInt();
			if (a==1)
				display();
			else if (a==2)
				viewCart();
			else if (a == 3) 
	   			System.exit(0);
	   		
	   	else 
            System.out.println("Invalid Choice");
	}while(a>3);
				
	}
	
	
	public void viewCart()
	{
		Scanner sc=new Scanner(System.in);
		 ListIterator<Items> it = cart.listIterator();
         int i = 1;
         int a;
         while (it.hasNext()) {
             Items k = it.next();
             
             System.out.println(i + " " + k.getName() + "\n");
             i++;
         }
         System.out.println("Cart total: " + sum);
do {
         System.out.println("Make a choice: 1. checkout 2. continue shopping 3. Remove from cart 4. exit");
         a = sc.nextInt();
         
         	if (a==1)
         	{
         		System.out.println("cart total:" + sum);
         		System.exit(0);
         	}
         
         	else if (a==2)
         		display();
         	else if(a==3) 
         		removeFromCart();
         	else if (a == 4) 
	   		
	   			System.exit(0);
	   		
         	else 
         		System.out.println("Invalid Choice");
}while( a >3);
		
	}
	

	
	
public void removeFromCart()
{
	Scanner sc=new Scanner(System.in);
	 ListIterator<Items> it = cart.listIterator();
    int i = 1;
    int a;
    while (it.hasNext()) {
        Items k = it.next();
        
        System.out.println(i + " " + k.getName() + "\n");
        i++;
    }
    

    System.out.println("Make a choice to remove:");
   
    a = sc.nextInt();
    
    if (a >= 1 && a <= cart.size()) {
        Items removedItem = cart.remove(a - 1);
        sum -= removedItem.getPrice();
        System.out.println("Product removed from cart");
    } else {
        System.out.println("Invalid choice");
    }
    
	
    
    do {		System.out.println("Make a choice: 1. Continue Shopping 2. View cart 3. Exit");
	 a = sc.nextInt();
	if (a==1)
		display();
	else if (a==2)
		viewCart();
	else if (a == 3) 
			System.exit(0);
		
	else 
   System.out.println("Invalid Choice");
}while(a>3);
    
}
	
	
}

