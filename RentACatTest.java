
public class RentACatTest {
	
	Cat cat = null;
	
	//Create an instance of Cat before it exists
	@Before
	public void init(){
		cat = new Cat();
	}
	
	//Two tests for rentCat method
	@Test
	public void catExist(){
		assertNotNull(cat);
	}
	
	@Test
	public void catNotExist(){
		assertNull(cat);
	}
	
	//Two methods for returnCat method
	@Test
	public void catReturned(){
		assertTrue(cat.returnCat("Sam"));
	}
	
	@Test
	public void catRented(){
		assertTrue(cat.rentCat());
	}
	
	
	
	
	
}
