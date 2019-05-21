import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardTest {
	
	@Test
	public void GIVEN_card_WHEN_isTheCardNextTo_THEN_True() {
		Card card = new CardBuilder().number(Number.FIVE).build();
		assertTrue(card.isNextTo(new CardBuilder().number(Number.FOUR).build()));
	}
	
	@Test
	public void GIVEN_card_WHEN_isTheCardNextTo_THEN_False() {
		Card card = new CardBuilder().number(Number.FIVE).build();
		assertFalse(card.isNextTo(new CardBuilder().number(Number.TWO).build()));
	}
	
	@Test
	public void Testflip() {
		Card card = new CardBuilder().build();
		assertFalse(card.isFacedUp());
		card.flip();
		assertTrue(card.isFacedUp());
		card.flip();
		assertFalse(card.isFacedUp());
	}
}


