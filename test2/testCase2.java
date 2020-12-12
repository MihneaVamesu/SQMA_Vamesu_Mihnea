import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCase2 {
	
	testClass2 car1 = new testClass2("Audi", "White", true);
	testClass2 car2 = new testClass2("BMW", "Black", false);
	testClass2 car3 = new testClass2("Lincoln", "Red", false);
	
	@Before
	public void setUp() {
		car1.getColor();
	}
	
	@Test
	public void rightColor() {
		assertEquals(car3.getColor(), "Red");
	}

	@Test
	public void rightCarModel() {
		assertEquals(car2.getCarModel(), "BMW");
	}

	
	@Test
	public void electric() {
		assertTrue(car1.getIsElectric());
		assertFalse(car3.getIsElectric());
	}
}
