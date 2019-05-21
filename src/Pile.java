import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pile extends CardStack{

	private int number;

	private int numberOfFaceUpCards;

	Pile(int number, List<Card> cards){
		for(int i = 0; i<number; i++) {
			cards_.push(cards.get(i));
		}
	}

	private void flipFirstCard() {
		if(!cards_.peek().isFacedUp()) {
			cards_.peek().flip();
		}
	}

	public boolean fistIn(Card card) {
		if (cards_.empty() && (card.getNumber() == Number.KING)){
			return true;
		}
		if (cards_.empty()) {
			return false;
		}

		if((card.getSuit().getColor() == cards_.peek().getSuit().getColor())){
			return false;
		} 

		if (cards_.peek().isNextTo(card)){
			return true;
		}
		return false;
	}

	public List<Card> getTop(int numberOfCards){
		List<Card> temp = new ArrayList<Card>();
		if (numberOfCards > cards_.size()) {
			return null;
		}
		if (!cards_.empty() ) {
			for (int i = 0; i<numberOfCards; i++) {
				temp.add(cards_.pop());
			}
			//flipFirstCard();
			return temp;
		}

		else {
			return null;
		}
	}

	public void addToTop(List<Card> cards) {
		for (int i = 0; i< cards.size(); i++) {
			if (fistIn(cards.get(i))){
				cards_.push(cards.get(i));
			}
		}
	}
	
	public Stack<Card> getCards(){
		if(!cards_.empty()) {
			return this.cards_;
		}
		else {
			return null;
			}
	}
	
	public int getNumber() {
		return (this.number = cards_.size());
	}
	
	public void removeTop(int numberOfCards) {
		if (numberOfCards > cards_.size()) {
			return;
		}
		if(!cards_.empty()) {
			for(int i=0; i< numberOfCards; i++) {
				cards_.pop();
			}
		}
		flipFirstCard();
		return;
	}
	
	public int numberOfFacedUp() {
		numberOfFaceUpCards=0;
		for (int i = 0; i< cards_.size(); i++) {
			if(cards_.get(i).isFacedUp()) {numberOfFaceUpCards++;}
		}
		return numberOfFaceUpCards;
	}
	
	@Override
	public boolean empty() {
		return super.empty();
	}
}
