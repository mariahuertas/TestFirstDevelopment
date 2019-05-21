import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PileTest {

	@Test
	public void GIVEN_card_WHEN_differentColorAndNextNumber_THEN_fitsIn() {
		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().cards(card).build();
		assertTrue(pile.fistIn(card2));
	}
	
	@Test
	public void GIVEN_card_WHEN_sameColorSuit_THEN_NoFitsIn() {
		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.DIAMONDS).build();
		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().cards(card).build();
		assertFalse(pile.fistIn(card2));
	}
	
	@Test
	public void GIVEN_card_WHEN_sameNumberAndColorSuit__THEN_NoFitsIn() {
		Card card = new CardBuilder().number(Number.SEVEN).suit(Suit.DIAMONDS).build();
		Card card2 = new CardBuilder().number(Number.SEVEN).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().cards(card).build();
		assertFalse(pile.fistIn(card2));
	}
	
	@Test
	public void GIVEN_card_WHEN_sameNumber_THEN_NoFitsIn() {
		Card card = new CardBuilder().number(Number.SEVEN).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.SEVEN).suit(Suit.DIAMONDS).build();
		Pile pile = new PileBuilder().cards(card).build();
		assertFalse(pile.fistIn(card2));
	}
	
	/*@Test
	public void GIVEN_card_WHEN_noFacedUp_THEN_FacedUp() {
		Card card = new CardBuilder().faceUp().build();
		Pile pile = new PileBuilder().cards(card).build();
		pile.flipFirstCard();
	}*/
	
	@Test
	public void GIVEN_numberOfCards_WHEN_getTop_THEN_true() {
		int numberOfCards = 2;
		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).build();
		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().cards(card).cards(card2).build();
		
		List<Card> testList = new ArrayList<Card>();
		testList.add(card2);
		testList.add(card);
		
		assertEquals(pile.getTop(numberOfCards), testList);
	}
//TODO =0
	
	@Test
	public void GIVEN_aPileEmpty_WHEN_addToTop_THEN_Noadded() {
		Pile pile = new PileBuilder().build();

		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).build();		
		List<Card> testList = new ArrayList<Card>();
		testList.add(card);
		pile.addToTop(testList);
		
		assertNotEquals(testList, pile.getCards());
	}
	
	@Test
	public void GIVEN_aPileEmpty_WHEN_addToTop_THEN_added() {
		Pile pile = new PileBuilder().build();

		Card card = new CardBuilder().number(Number.KING).suit(Suit.CLOVERS).build();		
		List<Card> testList = new ArrayList<Card>();
		testList.add(card);
		pile.addToTop(testList);
		
		assertEquals(testList, pile.getCards());
	}
	
	@Test
	public void GIVEN_aPilewith1card_WHEN_addToTop_THEN_added() {
		int number = 2;
		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).build();		
		Pile pile = new PileBuilder().cards(card).build();

		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.HEARTS).build();
		List<Card> testList = new ArrayList<Card>();
		testList.add(card2);
		pile.addToTop(testList);
		
		assertEquals(pile.getNumber(), number );
	}
	
	@Test
	public void GIVEN_aPilewith2card_WHEN_removeTop_THEN_removed() {
		int numberOfCards = 1;
		
		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).build();	
		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.HEARTS).build();
		Pile pile = new PileBuilder().cards(card).cards(card2).build();

		List<Card> testList = new ArrayList<Card>();
		testList.add(card);
		pile.addToTop(testList);
		
		pile.removeTop(numberOfCards);
		
		assertEquals(pile.getCards(), testList);
	}
	
	@Test
	public void GIVEN_aPilewith2card_WHEN_removeTop_THEN_returnNumberOfFacedUpCards() {
		int numberOfCards = 1;
		
		Card card = new CardBuilder().number(Number.FIVE).suit(Suit.CLOVERS).faceUp().build();	
		Card card2 = new CardBuilder().number(Number.FOUR).suit(Suit.HEARTS).faceUp().build();
		Pile pile = new PileBuilder().cards(card).cards(card2).build();
		assertEquals(2, pile.numberOfFacedUp());
		
		pile.removeTop(numberOfCards);
		
		assertEquals(1, pile.numberOfFacedUp());
	}
}
