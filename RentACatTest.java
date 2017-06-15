import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class RentACatTest {
	
	Cat cat = null;
	Customer cust = null;
	
	//Create an instance of Cat before it exists
	@Before
	public void init(){
		cat = new Cat("Yellow", 100, 0);
		cust = new Customer("CustomerName", 0);
	}
	
	//Two tests for rentCat method
	@Test
	public void catExist(){
		assertNotNull(cat);
	}
	
	@Test
	public void catNotExist(){
		cat = null;
		assertNull(cat);
	}
	
	//Two methods for returnCat method
	@Test
	public void catReturned(){
		Customer c = Mockito.mock(Customer.class);
		assertFalse(cat.returnCat("Sam"));
	}
	
	@Test
	public void catRented(){
		assertTrue(cat.rentCat());
	}
	
	@Test
	public void catToString(){
		
	}
	
	@Test
	public void catISRented(){
		
	}
	
	
	
}
