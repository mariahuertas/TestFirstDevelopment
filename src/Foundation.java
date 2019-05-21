import java.util.Stack;

public class Foundation extends CardStack {

	private Suit suit;
	
	public Foundation(Suit suit) {
		this.suit = suit;;
	}

	public boolean isComplete() {
		if(cards_.peek().getNumber() == Number.KING) {
			return true;
		}
		return false;
	}
	
	public boolean fitsIn(Card card) {
		if (cards_.empty() && (card.getNumber() == Number.AS)){
			return true;
		}

		if(card.getSuit() != this.getSuit()){
			return false;
		} 

		if (card.isNextTo(cards_.peek())){
			return true;
		}
		return false;
	}

	public Suit getSuit() {
		return this.suit;
	}

}
