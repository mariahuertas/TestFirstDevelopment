import java.util.ArrayList;
import java.util.List;

public class StockBuilder {
	private List<Card> cards;

	public StockBuilder() {
		this.cards = new ArrayList<Card>();
	}

	public StockBuilder cards (Card card) {
		this.cards.add(card);
		return this;
	}

	public Stock build() {
		Stock stock = new Stock();
		for (int i = 0; i<cards.size(); i++) {
			stock.push(cards.get(i));
		}
		return stock;
	}
}



