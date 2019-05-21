import java.util.ArrayList;
import java.util.List;

public class FoundationBuilder {
	private List<Card> cards;
	private Suit suit;

	public FoundationBuilder() {
		this.cards = new ArrayList<Card>();
		suit = Suit.DIAMONDS;
	}

	public FoundationBuilder cards (Card card) {
		this.cards.add(card);
		return this;
}
	public FoundationBuilder suit (Suit suit) {
		this.suit = suit;
		return this;
}
	
	public Foundation build() {
		Foundation foundation = new Foundation(this.suit);
		for (int i = 0; i<cards.size(); i++) {
			foundation.push(cards.get(i));
		}
		return foundation;
	}
	}
