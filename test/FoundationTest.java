import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FoundationTest {

	@Test
	public void GIVEN_lastElementOfFoundation_WHEN_isComplete_THEN_true() {
		Card card = new CardBuilder().number(Number.KING).build();

		Foundation foundation = new FoundationBuilder().cards(card).build();
		
		assertTrue(foundation.isComplete());
	}
	
	@Test
	public void GIVEN_aElementOfFoundation_WHEN_isComplete_THEN_false() {
		Card card = new CardBuilder().number(Number.QUEEN).build();
		Foundation foundation = new FoundationBuilder().cards(card).build();
		
		assertFalse(foundation.isComplete());
	}
	
	@Test
	public void GIVEN_aEmpyFoundation_WHEN_tryAddACorrectCard_THEN_fits() {
		Card card = new CardBuilder().number(Number.AS).build();
		Foundation foundation = new FoundationBuilder().build();
		
		assertTrue(foundation.fitsIn(card));
	}
	
	
	@Test
	public void GIVEN_aEmpyFoundation_WHEN_tryAddAIncorrectCard_THEN_noFits() {
		Card card = new CardBuilder().number(Number.THREE).build();
		Foundation foundation = new FoundationBuilder().build();
		
		assertFalse(foundation.fitsIn(card));
	}
	
	@Test
	public void GIVEN_aNotEmpyFoundation_WHEN_tryAddACorrectCardNumberAndSametSuit_THEN_fits() {
		Card card = new CardBuilder().number(Number.AS).suit(Suit.DIAMONDS).build();
		Foundation foundation = new FoundationBuilder().cards(card).build();
		
		Card card2 = new CardBuilder().number(Number.TWO).suit(Suit.DIAMONDS).build();

		assertTrue(foundation.fitsIn(card2));
	}
	
	@Test
	public void GIVEN_aNotEmpyFoundation_WHEN_tryAddACorrectCardNumberButDifferentSuit_THEN_notFits() {
		Card card = new CardBuilder().number(Number.AS).suit(Suit.DIAMONDS).build();
		Foundation foundation = new FoundationBuilder().cards(card).build();
		
		Card card2 = new CardBuilder().number(Number.TWO).suit(Suit.CLOVERS).build();

		assertFalse(foundation.fitsIn(card2));
	}
	
	@Test
	public void GIVEN_aNotEmpyFoundation_WHEN_tryAddAIncorrectCardNumberButSameSuit_THEN_notFits() {
		Card card = new CardBuilder().number(Number.AS).suit(Suit.DIAMONDS).build();
		Foundation foundation = new FoundationBuilder().cards(card).build();
		
		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.DIAMONDS).build();

		assertFalse(foundation.fitsIn(card2));
	}

}
