import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StockTest {
	
	@Test
	public void GIVEN_aFoundationWith2Cards_WHEN_takeOneOfTheTop_THEN_taked() {
		int quantity = 1;
		Card card = new CardBuilder().build();
		Card card2 = new CardBuilder().build();
		Stock stock = new StockBuilder().cards(card).cards(card2).build();
		
		List<Card> testList = new ArrayList<Card>();
		testList.add(card2);

		assertEquals(testList, stock.takeTop(quantity));
	}
	
	@Test
	public void GIVEN_aFoundationWith2Cards_WHEN_take3CardsOfTheTop_THEN_cannotTakeitSoSameStock() {
		int quantity = 3;
		Card card = new CardBuilder().build();
		Card card2 = new CardBuilder().build();
		Stock stock = new StockBuilder().cards(card).cards(card2).build();
		
		assertNull(stock.takeTop(quantity));
	}
	
	@Test
	public void GIVEN_aFoundationWith2Cards_WHEN_take0OfTheTop_THEN_sameStock() {
		int quantity = 0;
		Card card = new CardBuilder().build();
		Card card2 = new CardBuilder().build();
		Stock stock = new StockBuilder().cards(card).cards(card2).build();
		
		List<Card> testList = new ArrayList<Card>();

		assertEquals(testList, stock.takeTop(quantity));
	}
}
