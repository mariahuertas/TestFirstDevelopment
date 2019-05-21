
public class CardBuilder {
	private Suit suit;
	
	private Number number;
	
	private boolean faceUp;
	
	CardBuilder() {
		this.suit = Suit.CLOVERS;
		this.number = Number.AS;
		this.faceUp = false;
	}
	
	CardBuilder suit (Suit suit) {
		this.suit = suit;
		return this;
	}
	
	CardBuilder number (Number number) {
		this.number = number;
		return this;
	}
	 
	CardBuilder faceUp() {
		this.faceUp = true;
		return this; 
	}
	
	Card build() {
		Card card = new Card(this.suit, this.number);
		if (this.faceUp) {
			card.flip();
		} 
		return card;
	}
}
