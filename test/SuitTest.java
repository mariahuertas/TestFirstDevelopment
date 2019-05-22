import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SuitTest {
	@Test
	public void GIVEN_initial_WHEN_Suit_THEN_findSuit() {
		assertEquals(Suit.find('h'), Suit.HEARTS);
	} 
	
	@Test
	public void GIVEN_initialThatDoesntExist_WHEN_Suit_THEN_notFindSuit() {
		assertNotEquals(Suit.find('c'), Suit.HEARTS);
	}
	
	@Test
	public void GIVEN_initial_WHEN_Suit_THEN_notFindSuit() {
		assertNotEquals(Suit.find('i'), Suit.HEARTS);
	}
	
	@Test
	public void GIVEN_suit_WHEN_getAllTheInitials_THEN_getCorrectInitials() {
		assertArrayEquals(Suit.initials(), new char[] {'h','d','c','p'});
	}
	
	@Test
	public void GIVEN_aSuit_WHEN_getSuitColor_THEN_getCorrectColor() {
		assertEquals(Suit.HEARTS.getColor(), Color.RED );
	}
	
}
