import java.util.*;

public class RentACat {
	
	public ArrayList<Cat> Cats = new ArrayList<Cat>();
	public ArrayList<Customer> Customers = new ArrayList<Customer>();

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean valid;
		int choice = 0;
		Cat cat1 = new Cat("Cat1", 100, 0);
		Cat cat2 = new Cat("Cat2", 300, 1);
		Cat cat3 = new Cat("Cat3", 200, 2);
		Cats.add(cat1);
		Cats.add(cat2);
		Cats.add(cat3);
		//DOUBLED WHEN TESTING
		Customer customer1 = new Customer("Dave", 0);
		Customer customer2 = new Customer("Sam", 1);
		Customer customer3 = new Customer("Ashley", 2);
		Customers.add(customer1);
		Customers.add(customer2);
		Customers.add(customer3);
		//DOUBLED WHEN TESTING
		
		do{
			
			do
			{
				System.out.println("Option[1,2,3,4] > ");
				try 
				{
					valid = true;
					choice = sc.nextInt();
				}
				catch (InputMismatchException ime)
				{
					System.out.println("Invalid option! Try again");
					choice = 0;
					valid = false;
					sc.next();
				}
				if (choice > 4 || choice < 1)
				{
					System.out.println("Invalid option! Try again");
					valid = false;
				}
			} while (!valid);
			
			//User input
			switch (choice){
				
				case 1:
					//System Start up
					//Listing cats for rent
					cats.toString();
				break;
			
				case 2:
				//Asks for Customer ID
				//"Customer ID >" enter ID
				int custID = 0;
				
					do {
						System.out.println("Customer ID > ");
						try{
							valid = true;
							custID = sc.nextInt();
						}  
						catch (InputMismatchException ime)
						{
							System.out.println("Invalid option! Try again");
							custID = 0;
							valid = false;
							sc.next();	
						}
						
					}
					//if the customer doesn't exist "That customer doesn't exist!"
					//If customer does exist next prompt is
						//"Rent which cat? > "
						cats.rentCat();
							//if number is valid then "Catname has been renter to Customername"
				//WHEN ONE CAT IS RENTED EXIT LOOP AND NEW PERSON CAN RENT ANY OTHER CAT
				break;
			
				case 3:
				//Return the cat
				cats.returnCat();
				//Prompt says "Return which cat > "
					//if invalid say "Invalid cat ID" and reask
				//Renter pays "CustomerName paid Price"
				//Prompt says, "Welcome back, CAT NAME!"
				break;
			
				case 4:
				//Exit system
					System.out.println("Closing up shop for the day!");
					System.exit(1);
				break;
				
			}
			
		} while (choice != 4);
		
		
	}
	
	public void listCat() {
		System.out.println("Cats for Rent\n");
		for (int i = 0; i < cats.length; i++)
		{
			System.out.println("ID " + cats.getCatID + " " + cats.getCatName + ": " + cats.getCatPrice + " / day" );
		}
	}
	
	public String rentCat() {
		do
			{
				System.out.println("Rent which cat? > ");
				try 
				{
					valid = true;
					//choice = sc.nextInt();		//this will be the stringbuilder
				}
				catch (InputMismatchException ime)
				{
					System.out.println("Invalid option! Try again");
					//choice = 0;					//CAT NAME NULL
					valid = false;
					sc.next();
				}
			} while (!valid);
		
		return catName; //changeable
	}
	
	public String returnCat() {
		do{
			System.out.println("Return which cat? > ");
			try 
			{
				valid = true;
				//choice = sc.nextString(); //THIS WILL BE THE STRINGBUILDER 
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Invalid option! Try again");
				//choice = 0;			//CAT NAME NULL 
				valid = false;
				sc.next();
			}
				
		} while (!valid);
		
		return cat.toString(); //changeable
	}
	
	
	
	
	
}
