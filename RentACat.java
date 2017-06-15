import java.util.*;

public class RentACat {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean valid;
		int choice = 0;
		Cat cats = new Cat(3);
		//DOUBLED WHEN TESTING
		Customer customers = new Customer(3);
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
				if (choice > 4 || choice < 0)
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
					cats.listCat();
				break;
			
				case 2:
					
				//Asks for Customer ID
				//"Customer ID >" enter ID
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
	
	public void rentCat() {
		do
			{
				System.out.println("Rent which cat? > ");
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
			} while (!valid);
			
	}
	
	public void returnCat() {
		do{
			System.out.println("Return which cat? > ");
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
				
		} while (!valid);
		
		
	}
	
	
}
