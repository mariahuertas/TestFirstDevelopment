import java.util.Stack;

public abstract class CardStack {
	protected Stack<Card> cards_;
	
	CardStack(){
		cards_ = new Stack<Card>();
	};
	
	public boolean empty() {
		if (cards_.empty()) {
			return true;
			}
		else {
			return false;
			}
		
	}
	
	public Card peek() { //consulta la cima
		return cards_.peek();
	}

	public Card pop() { //coge la cima
		return cards_.pop();
	}
	
	public void push(Card card) {
		cards_.push(card);
	}
}
//fitsIn: ver si se puede meter una carta