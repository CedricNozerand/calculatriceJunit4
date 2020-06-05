package calculatrice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

	private CalculatriceService calculatrice;
	
	@Before
	public void setUp() {
		calculatrice = new CalculatriceService();
		System.out.println("initialisation");
	}
	
	@Test
	public void testAddition() {
		int resultat = calculatrice.addition(10, 5);
		assertEquals(resultat, 15);
		System.out.println("test de l'addition");
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivision(){
		calculatrice.division(10, 0);
		System.out.println("test de la division");
	}
	
	@After
	public void tearDown() {
		calculatrice = null;
		System.out.println("libération");
	}
}
