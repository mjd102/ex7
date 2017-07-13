import org.junit.*;
import static org.junit.Assert.*;

public class monkeySimTest {

	/**
	* Testing that monkey is not null
	*/

	@Test
	public void checkMonkeyID(){
		Monkey m = new Monkey();
		int a = m.generateId(1);
		assertNotNull(m);
	}
	/**
	* test that two monkeys ids are not the same
	*/

	@Test
	public void checkMonkeysID(){
		Monkey m = new Monkey();
		int a = m.generateId(1);
		int b = m.generateId(3);
		assertNotEquals(a,b);
		
	}

	// tests for right output
 
	@Test
	public void checkString(){
		Monkey m = new Monkey();
		Monkey m2 = new Monkey();
		String roundOutput = "//Round 1: Threw banana from Monkey (#8 / ID 223500) to Monkey (#4 / ID 223496)";
		assertEquals(roundOutput, "//Round 1: Threw banana from Monkey (#8 / ID 223500) to Monkey (#4 / ID 223496) ");
	}
} 
