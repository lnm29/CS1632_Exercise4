public class Cat{
	
	private final String name;
	private final double cost;
	private Customer renter;
	private final int ID;
	private boolean isRented;
	
	Cat(String newName, double newCost, int newID){
		this.name = newName;
		this.cost = newCost;
		this.renter = null;
		this.ID = newID;
		this.isRented = false;
	}
	
	public void rentCat(Customer newRenter){
		if(this.isRented == true){
			System.out.println("Sorry, " + this.name + " is not here!");
		}else{
			System.out.println(this.name + " has been rented to Customer " + newRenter.name + ".");
			this.isRented = true;
			this.renter = newRenter;
		}
	}
	
	public void returnCat(){
		if(this.renter == null){
			System.out.println(this.name + " can not be returned because it was not rented.");
			return;
		}
		System.out.println(this.renter.name + " paid " + this.cost + ".");
		System.out.println("Welcome back, " + this.name + "!");
		this.renter = null;
		this.isRented = false;
	}
	
	//ID 3. Mistoffelees: $500.00 / day
	public String toString(){
		String output;
		if(this.isRented == false){
			output = "ID " + this.ID + ". " + this.name + ": $" + this.cost + " / day";
		}else{
			output = "ID " + this.ID + ". " + this.name + ": RENTED";
		}
		return output;
	}
}