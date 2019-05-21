
public class Card {
	private Number number_;
	private Suit suit_;
	private boolean facedUp;

	Card(Suit suit, Number number){
		suit_ = suit;
		number_ = number;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (facedUp ? 1231 : 1237);
		result = prime * result + ((number_ == null) ? 0 : number_.hashCode());
		result = prime * result + ((suit_ == null) ? 0 : suit_.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (facedUp != other.facedUp)
			return false;
		if (number_ != other.number_)
			return false;
		if (suit_ != other.suit_)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Card [number_=" + number_ + ", suit_=" + suit_ + ", facedUp=" + facedUp + "]";
	}

	public boolean isNextTo(Card card) {
		if (card.getNumber().getValue() == (this.number_.getValue()-1)) {
			return true;
		}
		else {
		return false;
		} 
	} 

	public Card flip() {
		if (facedUp == false) {
			facedUp = true;
		}
		else {
			facedUp = false;
		}
		return this;
	}
	
	public Number getNumber() {
		return number_;
	}
	
	public Suit getSuit() {
		return suit_;
	}
	
	public boolean isFacedUp() {
		return facedUp;
	}
}
