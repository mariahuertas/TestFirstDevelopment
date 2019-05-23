import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest {

	@Test
	public void GIVEN_emptyGame_WHEN_moveStockToWasteWithCorrectConditions_THEN_true() {
		Card card = new CardBuilder().build();
		Card card2 = new CardBuilder().build();
		Card card3 = new CardBuilder().build();
		Stock stock = new StockBuilder().cards(card).cards(card2).cards(card3).build();
		
		Game game = new EmptyGameBuilder().stock(stock).build();
		
		assertNull(game.moveFromStockToWaste());
	}
	
	@Test
	public void GIVEN_emptyGame_WHEN_moveStockToWasteWithEmptyStock_THEN_error() {
		Stock stock = new StockBuilder().build();
		Game game = new EmptyGameBuilder().stock(stock).build();
		
		assertEquals(Error.EMPTY_STOCK, game.moveFromStockToWaste());
	}

}
