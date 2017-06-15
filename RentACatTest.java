import org.junit.*;
import static org.junit.Assert.*;

import org.mockito.*;

public class RentACatTest {

	Cat cat = null;

	//Create an instance of Cat before it exists
	@Before
	public void init(){
		cat = new Cat("Yellow", 100, 0);
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
		cat.rentCat(c);
		cat.returnCat();
		assertEquals(false, cat.isRented());
	}

	@Test
	public void catReturned2(){
		cat.returnCat();
		assertEquals(false, cat.isRented());
	}

	//Two methods for rentCat method
	@Test
	public void catRented(){
		Customer c = Mockito.mock(Customer.class);
		assertTrue(cat.rentCat(c));
	}

	@Test
	public void catRented2(){
		Customer c = Mockito.mock(Customer.class);
		cat.rentCat(c);
		assertFalse(cat.rentCat(c));
	}

	//Two methods for toString method
	@Test
	public void catToString(){
		assertEquals("ID 0. Yellow: $100.0 / day", cat.toString());
	}

	@Test
	public void catToString2(){
		Cat test = new Cat("hello", 1000, 35);
		assertEquals("ID 35. hello: $1000.0 / day", test.toString());
	}

	//Two methods for isRented() method
	@Test
	public void catIsRented(){
		assertEquals(false, cat.isRented());
	}

	@Test
	public void catIsRented2(){
		Customer c = Mockito.mock(Customer.class);
		cat.rentCat(c);
		assertEquals(true, cat.isRented());
	}

}
