import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PileBuilder {

	private List<Card> cards;
	
	private int number;

	private int numberOfFacedUpCards;


	public PileBuilder() {
		this.number = 0;
		this.numberOfFacedUpCards = 0;
		this.cards = new ArrayList<Card>();
	}

	public PileBuilder cards (Card card) {
		this.number++;
		this.cards.add(card);
		return this;
	}
	
	public PileBuilder numberOfFaceUpCards (int numberOfFacedUpCards) {
		this.numberOfFacedUpCards = numberOfFacedUpCards;
		return this;
	}

	public PileBuilder number (int number) {
		this.number = number;
		return this;
	}

	public Pile build() {
		Pile pile = new Pile(this.number, this.cards);
		return pile;
	}

}
